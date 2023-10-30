package a1_employee;

public class Employee
{
	int e_id;
	String name;
	
	public Employee(int e_id, String name)
	{
		this.e_id = e_id;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "["+e_id+", "+name+"]";
	}
	
	
	
	
}
