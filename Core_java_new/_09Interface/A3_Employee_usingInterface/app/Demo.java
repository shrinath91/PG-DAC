package app;

import employee.Admin;
import employee.Employee;
import employee.Programmer;
import employee.SalesManager;
import Employee_util.iTraveller;

public class Demo {

	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		arr[0] = new SalesManager("Shri",12,4,1997,1,20000,12000,15);
		arr[1] = new Programmer("Shri",12,4,1997,2,20000,12000,15);
		arr[2] = new Admin("Shri",12,4,1997,2,20000,12000);
		
		for(Employee e : arr)
		{
			if(e instanceof iTraveller)
			{
				System.out.println(((iTraveller)e).calculateTA());
			}
		}
		for(Employee e : arr)
		{
			System.out.println("Eid: "+ e.eid);
			if(e instanceof SalesManager)
			{
				System.out.println("S Toatal sal: "+(((SalesManager) e).calSalary()));
			}
			else if(e instanceof Programmer)
			{
				System.out.println("P Total sal: "+(((Programmer)e).calSalary()));
			}
			else 
				System.out.println("A Total Sal: "+(((Admin)e).calSalary()));
		}

	}

}
