public class DateDemo {
    	public static void main(String []args)
	{
	Date d1;
	d1=new Date();
	d1.showDate();
	
	Date d2;
	d2=new Date(12,12,2001);
	d2.showDate();
	
	Date d3;
	d3=new Date(d2);
	d3.showDate();

	Date d4=d3;
	d4.showDate();///here d4 is created as alais to d3
	

}

}
