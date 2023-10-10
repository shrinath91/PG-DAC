package employee;


public class Person {

	private String name;
	private Date bdate;
	public Person() {
		//super();
		name="null";
		bdate=new Date();
	}
	public Person(String name, int dd,int mm,int yy) {
		super();
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	public Person(Person p) {
		super();
		this.name = p.name;
		this.bdate = p.bdate;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
//		System.out.println("Date: "+bdate);
		bdate.display();
	}
}