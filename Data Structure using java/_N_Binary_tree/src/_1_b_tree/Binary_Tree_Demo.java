package _1_b_tree;

import java.util.Scanner;

public class Binary_Tree_Demo
{
	public static void main(String args[])
	{
		int ch, data;
		Binary_Tree b1 = new Binary_Tree();
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("\n1. Add Node");
			System.out.println("2. Display Tree");
			System.out.println("0. Exit");

			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("Enter data to add: ");
				data = sc.nextInt();
				b1.addNode(data);
				break;
				
			case 2:
				b1.display();
				break;
				
				default:
					System.out.println("Kripaya ankh khol ke choice dale!!!");
			}
			
		}while(ch!=0);
		sc.close();
	}
}
