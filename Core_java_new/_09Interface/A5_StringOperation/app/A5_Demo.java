package app;

import java.util.Scanner;

import stringOperation_utility.StringOperation;
import string_ops.StringOps;

public class A5_Demo
{
	public static void main(String[] args)
	{
		String str=null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		str = sc.next();
		
		StringOperation s1 = new StringOps();
//		StringOps s1 = new StringOps();
		s1.reverse(str);
		
		s1.toUpperCase(str);
		
		boolean flag=s1.isPallindrome(str);
		if(flag)
			System.out.println("Pallindrome: True");
		else
			System.out.println("Pallindrome: False");
		
		System.out.println(s1.append(str, ", Hello!!!"));
	
	}
}
