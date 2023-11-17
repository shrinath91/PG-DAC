package a5;

import java.util.Set;
import java.util.TreeSet;

public class Emp_TreeSet
{
	public static void main(String[] args)
	{
		Set<Emp> employees = new TreeSet<Emp>();
		
		employees.add(new Emp(1,1,"Tokas",23900.23));
		employees.add(new Emp(2,2,"Daulat",34000));
		employees.add(new Emp(3,1,"Kamal",45009));
		employees.add(new Emp(4,3,"Rock",98000));
		employees.add(new Emp(5,3,"Hari",2344));
		employees.add(new Emp(6,2,"Shyam",56000));
		employees.add(new Emp(7,1,"Pablo",45667));
		employees.add(new Emp(8,2,"Mike",34566));
		
		for(Emp e :employees)
		{
			System.out.println(e);
		}
		
	}
	
}
