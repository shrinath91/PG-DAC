package assignments;

import java.util.Scanner;

public class _3_prime_or_not
{
	public static boolean checkPrime(int num)
	{
		if(num == 1 && num == 0)
			return false;
		if(num == 2)
			return true;

		for (int i = 2; i <= num/2; i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		int ch, num;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("Enter 0 to Exit \tEnter 1 to continue ");
			ch = sc.nextInt();

			System.out.println("Enter a number to check: ");
			num = sc.nextInt();

			//			if(num == 1)
			//				System.out.println(num+" its not prime number.");
			//			else if(num == 2)
			//				System.out.println(num+" its not prime number.");

			Boolean flag = checkPrime(num);
			if(flag)
				System.out.println(num+" prime number.");
			else
				System.out.println(num+" not prime number.");


		}while (ch!=0);
		sc.close();
	}

}
