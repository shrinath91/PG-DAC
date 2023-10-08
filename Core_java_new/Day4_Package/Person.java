package office.staff;

public class Person
{	
	private String name;
	public Person()
	{
		
		name= new String("Empty");
	}
	public Person(String name)
	{
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
	}
	
}