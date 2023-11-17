package _3_BST_operation;

import java.util.Scanner;

public class BST_Ops_Demo
{
	public static void main(String args[])
	{
		int ch, data;
		BST_Ops b2 = new BST_Ops();
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("\n1. Add Node");
			System.out.println("2. Display Tree");
			System.out.println("3. Delete Node");
			System.out.println("4. Search Node");
			System.out.println("5. Find Highest");
			System.out.println("6. Find Lowest");
			System.out.println("7. Print Levelwise");

			System.out.println("0. Exit");

			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("Enter data to add: ");
				data = sc.nextInt();
				b2.addNode(data);
				break;

			case 2:	
				b2.display();
				break;

			case 3:
				System.out.print("Enter data to delete: ");
				data = sc.nextInt();
				b2.deleteNode(data);
				break;

			case 4:
				System.out.print("Enter data to Search: ");
				data = sc.nextInt();
				b2.SearchNode(data);
				break;

			case 5:
				data=b2.findHighest(); 
				System.out.print("Highest Node data: "+data);
				break;
				
			case 6:
				data=b2.findLowest(); 
				System.out.print("Lowest Node data: "+data);
				break;
				
			case 7:
				b2.displayLevelwise();
				break;

			default:
				System.out.println("Kripaya ankh khol ke choice kijiye!!!");
			}

		}while(ch!=0);

		sc.close();
	}
}
