package a;

import java.util.Scanner;

public class _5_perfect {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		
		for(int i=1; i<=num/2; i++)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
		}
		
		if(num==sum)
		{
			System.out.println("Its perfect....burahhhhhh!!!!");
		}
		else
			System.out.println("Oye, Paji its not perfect number");
		
		
		
	}

}
