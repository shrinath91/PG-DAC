package a2;

import java.util.HashMap;
import java.util.Map;

public class Map_usingString
{
	public static void main(String[] args)
	{
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(1,"Shalaka");
		m1.put(2,"Shalaka");
		m1.put(3,"Shalaka");
		m1.put(4,"Tokas");
		m1.put(5,"Daulat");
		m1.put(6,"Jagat Janni");
		m1.put(6,"Pasha");
		
		System.out.println(m1);
	}
}
