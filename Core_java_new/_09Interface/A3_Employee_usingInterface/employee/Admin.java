package employee;

public class Admin extends Employee {
	private int bonus;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name,int dd,int mm,int yy, int eid, double salary, int bonus) 
	{
		super( name, dd, mm, yy,  eid,  salary);
		this.bonus = bonus;
	}
//	public double calSalary() {
//	System.out.println("Salary of Emp having EMPID: "+ eid +" is "+(salary+bonus));
//	}		
	public double calSalary() {
		return (salary+bonus);
	}
	


}