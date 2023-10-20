package a;

import java.util.Scanner;

public class _3_fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int term = sc.nextInt();
		sc.close();
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=0; i<term; i++)
		{
			System.out.println(a+", ");
			c = a+b;
			a = b;
			b = c;
		}
		
	}

}
