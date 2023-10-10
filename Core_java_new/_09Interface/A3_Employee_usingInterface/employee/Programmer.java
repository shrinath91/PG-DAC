package employee;

import Employee_util.iTraveller;

public class Programmer extends Employee implements iTraveller{
	private int extra_charges;
	private int no_days;
	
	public Programmer() {//////////////////////
		super();
	}
	public Programmer(String name,int dd,int mm,int yy, int eid, double salary, int extra_charges, int no_days) {
		super( name, dd, mm, yy,  eid,  salary);
		this.extra_charges = extra_charges;
		this.no_days=no_days;
	}


	public double calSalary() {
		//System.out.println("Salary of Emp having EMP ID: "+eid+" is "+(salary+extra_charges));
		return (salary+extra_charges + calculateTA());
	}
	@Override
	public double calculateTA() {
		System.out.println("Inside Programmer");
		return DA * no_days + extra_charges +salary;
	}
//	public void display()
//	{
//		System.out.println("Inside Programmer");
//	}
	
	
}
