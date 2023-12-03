drop function if exists cal_tot_amt;
delimiter #
create function cal_tot_amt(e_id int, s_code1 int, s_code2 int, s_Code3 int )
returns int

begin
	declare e_price float(9,2) default 0;
	declare s1 float(9,2) default 0;
	declare s2 float(9,2) default 0;
	declare s3 float(9,2) default 0;
	declare tot float(9,2) default 0;
	
        select  event_price into e_price from event where Event_id=e_id;
        

	if s_code1 = 1 then 
			  (select service_price into s1
			  from service
			  where service_id=1 limit 1);
	
	end if;

	if s_code2 = 1 then 
			  (select service_price into s2
			  from service
			  where service_id=2 limit 1);
	
	end if;

	if s_code3 = 1 then 
			  (select service_price into s3
			  from service
			  where service_id=3 limit 1);
	
	end if;

	set tot = e_price+s1+s2+s3;
	set tot = tot+(tot*0.18); 
	return tot;
end#
delimiter ;



drop function if exists event_is_present;
delimiter # 
create function event_is_present(id int) returns boolean
begin
	declare x boolean;
	if id in (select event_id from event) then
		set x = true;
	else
		set x = false;
	end if;
	return x;
end #
delimiter ;


drop function if exists user_is_present;
delimiter # 
create function user_is_present(id int) returns boolean
begin
	declare x boolean;
	if id in (select user_id from user) then
		set x = true;
	else
		set x = false;
	end if;
	return x;
end #
delimiter ;







drop procedure if exists insert_booking;
delimiter #
create procedure insert_booking(u_id int,e_date date,e_id int,s1 int,s2 int,s3 int, v varchar(50))
begin
	if user_is_present(u_id) and event_is_present(e_id) then
		insert into booking(user_id,Booking_date,event_date,event_id,service_code1,service_code2,service_code3,Venue) values(u_id,curdate(),e_date,e_id,s1,s2,s3,v);
	elseif user_is_present(u_id) = false then
		select 'User is Not Present';
	elseif event_is_present(e_id) = false then
		select 'Event is Not Present';
	end if;
end #
delimiter ;













drop trigger if exists b_insert_booking;
delimiter #
create trigger b_insert_booking
before insert on booking
for each row
begin
	declare y float(9,2);
	
	select cal_tot_amt(new.event_id, new.service_code1, new.service_code2, new.service_code3) into y;
	set new.Total_amount = y;
end #
delimiter ;



drop trigger if exists b_delete_booking;
delimiter #
create trigger b_delete_booking
before delete on booking
for each row
begin
    declare y float(9,2);
    
    select cal_tot_amt(old.event_id, old.service_code1, old.service_code2, old.service_code3) into y;
    
    insert into cancel_booking (booking_id, user_id, booking_date, event_date, event_id, service_code1, service_code2, service_code3, venue, total_amount, cancel_date) values 
    (
        old.booking_id,
        old.user_id,
        old.booking_date,
        old.event_date,
        old.event_id,
        old.service_code1,
        old.service_code2,
        old.service_code3,
        old.venue,
        total_amount,
        current_date  
    );
end #
delimiter ;




