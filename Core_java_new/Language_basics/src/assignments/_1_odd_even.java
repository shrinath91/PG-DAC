package assignments;

import java.util.Scanner;

public class _1_odd_even
{

	public static void main(String[] args)
		{
			int ch, num;
			Scanner sc = new Scanner(System.in);

			do
				{
					System.out.println("Enter 0 to Exit \tEnter 1 to continue ");
					ch = sc.nextInt();

					System.out.println("Enter number to check: ");
					num = sc.nextInt();
					if(num%2==0)
						{
							System.out.println("Its Even!!!\n");
						}
					else
						{
							System.out.println("Its Odd!!!\n");
						}

				}while (ch!=0);
			sc.close();
		}

}
