package a1;

import java.util.PriorityQueue;
import java.util.Queue;


public class MyString
{
	public static void main(String[] args)
	{
		Queue <String>q1 = new PriorityQueue<String>();
		
		q1.add("zellooooooooooooooooooooo");
		q1.add("welcome");
		q1.add("to");
		q1.add("new");
		q1.add("world");
		q1.add("of");
		q1.add("Collection");
		q1.add("collection");//elements are removed based on priority
		
		
		for(String s : q1)
		{
			System.out.println(s);
		}
		
		q1.remove();
		
		System.out.println("/////////////	");
		System.out.println(q1);
	}
	
	
	
}
