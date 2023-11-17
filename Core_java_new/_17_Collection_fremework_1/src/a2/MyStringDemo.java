package a2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MyStringDemo
{
	public static void main(String[] args)
	{
		List<String> words = new ArrayList<String>();

		int ch;
		String str;
		Scanner sc = new Scanner(System.in);

		words.add("Hello,");
		words.add("Wolcome");
		words.add("to");
		words.add("New World");
		words.add("of");
		words.add("Collections");

		///////////////////////////////////////////////////////////////////////////
		System.out.println("Total No. of elements: "+words.size());

		/////////////////
		System.out.println("\n############Advanced for loop############");
		for(String s : words)
		{
			System.out.println(s.toUpperCase());
		}

		/////////////////
		System.out.println("\n############Using iterator############");
		Iterator<String> i = words.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		////////////////
		System.out.println("\n############Using listiterator############");	
		ListIterator<String> li = words.listIterator();
		while(li.hasNext())
		{
			li.next();
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}

		//////////////////
		System.out.println("\n############Using foerach method############");
		words.forEach((String s)->System.out.println(s));

		///////////////////////////////////////////////////////////////////////////
		Collections.sort(words);
		System.out.println("\nAfter Sorting:");
		for(String s : words)
		{
			System.out.println(s);
		}

		///////////////////////////////////////////////////////////////////////////
		System.out.println("\nSorted in Reverse order: ");
		ListIterator<String> l = words.listIterator();
		while(l.hasNext())
			l.next();

		while(l.hasPrevious())
			System.out.println(l.previous());

		///////////////////////////////////////////////////////////////////////////
		System.out.print("\nEnter a string to search: ");
		str=sc.next();
		int index = Collections.binarySearch(words, str);
		System.out.println("Element found at "+index);
		sc.close();
	}


}
