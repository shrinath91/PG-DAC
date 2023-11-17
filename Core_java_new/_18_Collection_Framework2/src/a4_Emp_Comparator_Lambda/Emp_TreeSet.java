package a4_Emp_Comparator_Lambda;

import java.util.Set;
import java.util.TreeSet;

public class Emp_TreeSet
{
	public static void main(String[] args)
	{
		Set<Emp> employees = new TreeSet <Emp>((Emp e1, Emp e2)->{
			int diff=0;
			if(e1.salary > e2.salary)
				diff=1;
			else if(e1.salary < e2.salary)
				diff=-1;
			return diff;
		});

		employees.add(new Emp(1,"Tokas",23900.23));
		employees.add(new Emp(2,"Daulat",34000));
		employees.add(new Emp(3,"Kamal",45009));
		employees.add(new Emp(4,"Rock",98000));
		employees.add(new Emp(5,"Hari",2344));
		employees.add(new Emp(6,"Shyam",56000));
		employees.add(new Emp(7,"Pablo",45667));
		employees.add(new Emp(8,"Mike",34566));
		employees.add(new Emp(8,"Mike",34566));

		for(Emp e: employees)
		{
			System.out.println(e);
			System.out.println();
		}




	}

}
