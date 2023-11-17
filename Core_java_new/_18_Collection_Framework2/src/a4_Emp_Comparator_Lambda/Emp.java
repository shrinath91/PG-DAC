package a4_Emp_Comparator_Lambda;

public class Emp 
{
	int id;
	String name;
	double salary;
	public Emp(int id, String name, double salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "[Id: "+id+" Name: "+name+" Salary: "+salary+"]\n";
	}
	
	
	
}
