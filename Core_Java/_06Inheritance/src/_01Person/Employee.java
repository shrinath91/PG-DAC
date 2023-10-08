package _01Person;

public class Employee extends Person {
	//private Person p1;
			private int eid;
			private double salary;
			
			public Employee() {
				super();
				eid=1;
				salary=0;
			}
			
			
			public Employee(String name,int dd,int mm,int yy, int eid, double salary) {
				//super();
				//this.p1 = p1;
				super(name,dd,mm,yy);
				this.eid = eid;
				this.salary = salary;
			}
			

		


			public void display()
			{
				super.display();
				System.out.println("Emp ID: "+eid);
				
				System.out.println("Salary: "+salary);
				System.out.println();
				System.out.print("abc\n");
				
			}
}
