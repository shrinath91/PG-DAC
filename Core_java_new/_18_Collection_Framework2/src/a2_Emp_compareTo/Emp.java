package a2_Emp_compareTo;

public class Emp implements Comparable<Emp>
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
	@Override
	public int compareTo(Emp o)
	{
		int diff=0;
		if(this.salary > o.salary)
			diff=1;
		else if(this.salary < o.salary)
			diff=-1;
		
		return diff;
	}
	
	
}
