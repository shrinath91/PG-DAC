package a5;

public class Emp implements Comparable<Emp>
{
	int id;
	int dept_no;
	String name;
	double salary;

	public Emp(int id, int dept_no, String name, double salary)
	{
		super();
		this.id = id;
		this.dept_no = dept_no;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "[Id:"+id+" Dept No:"+dept_no+" Name: "+name+" Salary: "+salary+"]\n";
	}
	@Override
	public int compareTo(Emp o)
	{
		int diff=0;
		if(this.dept_no > o.dept_no)
			diff=1;
		else if(this.dept_no < o.dept_no)
			diff=-1;
		else if(this.dept_no == o.dept_no)
			diff=0;
		
		if(diff==0)
		{
			if(this.salary < o.salary)
				diff=1;
			else if(this.salary > o.salary)
				diff=-1;
			else
			{
				diff=this.name.compareTo(o.name);
				if(diff==0)
				{
						diff=this.id-o.id;
				}
			}
		}

		return diff;
	}


}
