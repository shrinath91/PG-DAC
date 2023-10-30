package a2;

import java.util.Scanner;

public class Demo_LinkedList {

	
	public static void main(String[] args) {

		int ch, num;
		boolean flag;
		Scanner sc = new Scanner(System.in);
		MyLinkedList_Sort l1 = new MyLinkedList_Sort();
		
		System.out.println("1.Add Node");
		System.out.println("2.Display Linked List");
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
				l1.display();
				break;
			
			case 99:
				menu();
				break;
			default:
				System.out.println("Invalid");
			}
			
		}while(ch!=0);
		
		sc.close();
	}


	public static void menu()
	{
		System.out.println("1.Add Node");
		System.out.println("2.Display Linked List");	
		System.out.println("0.Exit");
	}
}
