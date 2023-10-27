package a2;

import java.util.Scanner;

public class Demo_LinkedList {

	
	public static void main(String[] args) {

		int ch, num;
		boolean flag;
		Scanner sc = new Scanner(System.in);
		MyLinkedList l1 = new MyLinkedList();
		
		System.out.println("1.Add Node");
		System.out.println("2.Create Linked list for table of 5");
		System.out.println("3.Display Linked List");
		System.out.println("4.Search data and Delete node");
		System.out.println("5.Print Likned list in reverse");
		System.out.println("6.Insert at Pos");
		System.out.println("7.Find MId of Liked List");
		System.out.println("0.Exit");

		do {
			System.out.println("\n####99. Menu");
			System.out.print("####Please Enter a choice:");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1: 
				System.out.print("Please enter data to add into Linked List:");
				num = sc.nextInt();
				l1.addNode(num);
				break;
				
			case 2:
				System.out.print("Please enter size of List:");
				num = sc.nextInt();
				l1.createLinkedList(num);
				break;
				
			case 3:
				l1.display();
				break;
				
			case 4:
				System.out.print("Enter Data to seach and delete that position:");
				num = sc.nextInt();
				l1.delete(num);
				break;
				
			case 5:
				System.out.println("Reverse Liked list:");
				l1.printReverseOrder(l1.head);
				break;
				
			case 6:
				System.out.println("Please enter data:");
				int data = sc.nextInt();
				System.out.println("Please enter Pos:");
				int pos = sc.nextInt();
				l1.insertAtPos(pos, data);
				break;
				
			case 7:
				System.out.println("Value at Mid: "+ l1.findMidValue());
				break;
				
			case 99:
				menu();
				break;
			default:
			}
		}while(ch!=0);
		
		sc.close();
	}


	public static void menu()
	{
		System.out.println("1.Add Node");
		System.out.println("2.Create Linked list for table of 5");
		System.out.println("3.Display Linked List");
		System.out.println("4.Search data and Delete node");
		System.out.println("5.Print Likned list in reverse");
		System.out.println("6.Insert at Pos");
		System.out.println("7.Find MId of Liked List");
		System.out.println("0.Exit");
	}
}
