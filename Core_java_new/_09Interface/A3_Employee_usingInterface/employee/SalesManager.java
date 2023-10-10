package employee;

import Employee_util.iTraveller;

public class SalesManager extends Employee implements iTraveller {
	private double incentive;
	private int no_days;
	
	public SalesManager() {////////////////////////////////////////////////
		super();
	}
	public SalesManager(String name,int dd,int mm,int yy, int eid, double salary, double incentive, int no_days) {
		super(name, dd, mm, yy,  eid, salary);
		this.incentive = incentive;
		this.no_days=no_days;
		
	}
	
	public double calSalary() {
//		System.out.println("Salary of Emp having EMP ID: "+ eid +" is "+(salary+(incentive)));
		return (salary+incentive + calculateTA());
	}	
	
	@Override
	public double calculateTA() {
		System.out.println("Inside SalesM");
		return DA * no_days * salary/100 ;
	}	
//	public void display()
//	{
//		System.out.println("Inside SalesM");
//	}

}
