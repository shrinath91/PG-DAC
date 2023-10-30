package a1;

import java.util.Scanner;

public class LL_Book_Demo {

	public static void main(String[] args) {
		LinkedListBook l1 = new LinkedListBook();
		int ch, num;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Add Node");
		System.out.println("2.Display LList");		
		System.out.println("3.Create Link List");		
		System.out.println("0.Exit");		

		do {
			System.out.println("\n##############################");
			System.out.println("99.Display Menu");
			System.out.print("Please Enter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1: 
				System.out.println("\n*****Enter details of book*****");
				l1.addNode();
				break;
				
			case 2: 
				l1.display();
				break;
			
			case 3: 
				System.out.print("Enter size of Linked List: ");
				int size = sc.nextInt();
				l1.createLinkedList(size);
				break;
				
			case 99: 
				menu();
				break;
				
			default:
				System.out.println("$$$$$$$$$$__Invalid Input__$$$$$$$$$$");
			}
			
		}while(ch!=0);
		

	}
	
	public static void menu()
	{
		System.out.println("1.Add Node");
		System.out.println("2.Display LList");	
		System.out.println("3.Create Link List");	
	}

}

