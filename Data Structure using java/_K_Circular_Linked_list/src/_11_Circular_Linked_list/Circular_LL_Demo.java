package _11_Circular_Linked_list;

import java.util.Scanner;

public class Circular_LL_Demo {

	public static void main(String[] args) 
	{
		int ch, data, pos;
		Circular_LL l1 = new Circular_LL();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Show Menu");
		System.out.println("2. Add At Beg");
		System.out.println("3. Add At End");
		System.out.println("4. Add At Mid");
		System.out.println("5. Delete Beg");
		System.out.println("6. Delete End");
		System.out.println("7. Delete Mid");
		System.out.println("8. Display");
		System.out.println("9. Find Size");
		
		do 
		{
			System.out.println("\n1. Show Menu");
			System.out.print("#Please Enter Choice: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				menu();
				
				break;
			case 2:
				System.out.print("Enter data to add at Beg: ");
				data = sc.nextInt();
				l1.addBeg(data);
				l1.display();///
				break;
				
			case 3:
				System.out.print("Enter data to add at End: ");
				data = sc.nextInt();
				l1.addEnd(data);
				l1.display();//
				break;
				
			case 4:
				System.out.print("Enter Pos: ");
				pos = sc.nextInt();
				System.out.print("Enter data to add: ");
				data = sc.nextInt();
				l1.addMid(data, pos);
				l1.display();///
				break;
				
			case 5:
				data = l1.deleteBeg();
				System.out.println("Deleted data at Beg is: "+data);
				l1.display();///
				break;
				
			case 6:
				data = l1.deleteEnd();
				System.out.println("Deleted data at End is: "+data);
				l1.display();///
				break;

			case 7:
				System.out.print("Enter pos to delete: ");
				pos = sc.nextInt();
				data = l1.deleteMid(pos);
				System.out.println("Deleted data is: "+data);
				l1.display();///
				break;
				
			case 8:
				System.out.println("\n**** Circular Linked List ****");
				l1.display();
				break;

			case 9:
				System.out.print("Size: "+l1.size());
				break;
			}
			
		}while(ch!=0);
		
	}
	
	public static void menu()
	{
		System.out.println("1. Show Menu");
		System.out.println("2. Add At Beg");
		System.out.println("3. Add At End");
		System.out.println("4. Add At Mid");
		System.out.println("5. Delete Beg");
		System.out.println("6. Delete End");
		System.out.println("7. Delete Mid");
		System.out.println("8. Display");
		System.out.println("9. Find Size");
	}

}
