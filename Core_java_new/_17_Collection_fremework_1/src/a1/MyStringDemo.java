package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyStringDemo
{
	public static void main(String[] args)
	{
		List<String> words = new ArrayList<>();

		int ch;
		String str;
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.print("Enter String to add: ");
			str = sc.next();
			words.add(str);

			System.out.println("'0' to Quit\n'1' to continue: ");
			ch=sc.nextInt();

		}
		while(ch!=0);

//		System.out.println(words); better way with []
		for(String s :words)
		{
			System.out.println(s);
		}

		do 
		{
			int last_ind=words.size()-1;
			System.out.print("Enter index to display from 0 to "+last_ind+": " );
			int i = sc.nextInt();
			if(i<0 || last_ind<i)
			{
				System.out.println("Out of Bound");
//				continue;
			}
			else
			{
				System.out.println("String at "+i+": "+words.remove(i));
			}

			System.out.println("'0' to Quit\n'1' to continue: ");
			ch=sc.nextInt();

		}
		while(ch!=0);
		

	}


}
