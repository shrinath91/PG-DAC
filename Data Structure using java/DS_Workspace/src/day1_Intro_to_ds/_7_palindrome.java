package day1_Intro_to_ds;

import java.util.Scanner;

public class _7_palindrome 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1ber: ");
		sc.close();
		
		int num1 = sc.nextInt();
		int num2=0;
		
		int temp = num1;
		
		int mod=0;
		while(temp!=0)
		{
			mod = temp%10;
			num2 = num2*10 + mod;
			
			temp/=10;
		}
		
		System.out.println("num1:"+ num1);
		System.out.println("num2:"+ num2);
		
		if(num1==num2)
		{
			System.out.println("Its Palindrome Pajii!!!!!!!!!!");
		}
		else
			System.out.println("Paji its not a palindrome!!!!!!!");
		
	}

}
