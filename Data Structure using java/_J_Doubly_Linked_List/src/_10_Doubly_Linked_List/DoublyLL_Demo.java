package _10_Doubly_Linked_List;

import java.util.Scanner;

public class DoublyLL_Demo {

	public static void main(String[] args) 
	{
		int ch, data;
		DoublyLL l1 = new DoublyLL();
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Menu");
		System.out.println("2. Add Node");
		System.out.println("3. Create Linked List");
		System.out.println("4. Add Linked List of Prime Number");
		System.out.println("5. Display");
		System.out.println("6. Insert at Position");
		System.out.println("7. Delete data at Pos");
		System.out.println("8. Print Reverse");
		System.out.println("9. Display Element at Pos");
		do 
		{
			System.out.println("\n1.Menu");
			System.out.print("Please enter choice:");
			ch = sc.nextInt();
			System.out.println();

			switch(ch)
			{
			case 1:
				menu();
				break;

			case 2:
				System.out.print("\nEnter value to add: ");
				data = sc.nextInt();
				l1.addNode(data);
				break;

			case 3:
				System.out.print("\nEnter size of linked list: ");
				data = sc.nextInt();
				l1.createLinkedList(data);
				break;

			case 4:
				System.out.print("\nEnter size of linked list: ");
				data = sc.nextInt();
				l1.createPrimeLinkedList(data);
				break;
				
			case 5:
				System.out.println("\n**** Doubly Linked List ****");
				l1.display();
				break;

			case 6:
				System.out.print("Enter pos: ");
				int pos = sc.nextInt();
				System.out.print("Enter data: ");
				data = sc.nextInt();
				l1.insertPos(pos,data);
				break;
				
			case 7:
				System.out.print("Enter data to delete from LL: ");
				data = sc.nextInt();
				l1.deleteData(data);
				break;
			case 8:
				l1.reverseDisplay();
				break;
			case 9:
				System.out.print("Enter Data to search: ");
				data = sc.nextInt();
				l1.displayPos(data);
				break;

			}

		}while(ch!=0);

		sc.close();

	}

	public static void menu()
	{
		System.out.println("1. Menu");
		System.out.println("2. Add Node");
		System.out.println("3. Create Linked List");
		System.out.println("4. Add Linked List of Prime Number");
		System.out.println("5. Display");
		System.out.println("6. Insert at Position");
		System.out.println("7. Delete data at Pos");
		System.out.println("8. Print Reverse");
		System.out.println("9. Search Element");

		System.out.println();
	}

}
