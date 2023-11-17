package _2_b_search_tree;

import java.util.Scanner;

public class Binary_S_Tree_Demo
{
	public static void main(String args[])
	{
		int ch, data;
		Binary_S_Tree b1 = new Binary_S_Tree();
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
				
			case 0:
				return;
				

			default:
				System.out.println("Bhidu ankh khol ke choice dal!!!");
			}

		}while(ch!=0);

		sc.close();
	}
}
