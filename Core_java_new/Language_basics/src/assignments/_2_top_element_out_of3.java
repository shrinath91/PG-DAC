package assignments;

import java.util.Scanner;

public class _2_top_element_out_of3
	{
		public static int findmax(int num1, int num2, int num3)
		{
			int max = num1;
			
			if(num2 > max)
				max = num2;
			if(num3 > max)
				max = num3;
			
			return max;
		}

		public static void main(String[] args)
			{
				int num1, num2, num3;
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter Num1: ");
				num1 = sc.nextInt();
				System.out.print("Enter Num2: ");
				num2 = sc.nextInt();
				System.out.print("Enter Num3: ");
				num3 = sc.nextInt();
				
				System.out.println("Max: "+findmax(num1, num2, num3));
				
				sc.close();

				
			}

	}


//
//public static void main(String[] args)
//	{
//		int ch, num;
//		Scanner sc = new Scanner(System.in);
//
//		do
//			{
//				System.out.println("Enter 0 to Exit \tEnter 1 to continue ");
//				ch = sc.nextInt();
//
//				
//				
//				
//				
//				
//			}while (ch!=0);
//		sc.close();
//	}
