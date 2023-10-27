package a1_Linked_list_int;

import java.util.Scanner;

public class Demo_LinkedList {

	public static void main(String[] args) {

		int ch, num;
		Scanner sc = new Scanner(System.in);
		MyLinkedList l1 = new MyLinkedList();
		
		do {
			System.out.println("\n1.Add Node");
			System.out.println("2.Create Linked list for table of 5");
			System.out.println("3.Display Linked List");
			System.out.println("0.Exit");
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
			default:
			}
		}while(ch!=0);
		
		sc.close();
	}

}
