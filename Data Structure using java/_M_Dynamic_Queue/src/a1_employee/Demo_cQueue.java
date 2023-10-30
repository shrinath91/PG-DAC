package a1_employee;

import java.util.Scanner;

public class Demo_cQueue
{

	public static void main(String[] args)
	{
		int id;
		String name;
		int data;
		int ch;
		cQueue q1=new cQueue();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println(" 1. Add ");
			System.out.println(" 2. Delete ");
			System.out.println(" 3. Display ");
			
			System.out.println(" 0. Exit");
			System.out.print(" #Enter Your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Data to insert:");
				System.out.print("Name: ");
				name=sc.next();
				System.out.print("Id: ");
				id=sc.nextInt();
//				Employee e = new Employee(id,name);
				q1.enQueue(new Employee(id, name));
				break;
			
			case 2:
				System.out.println("Deleted record: ");
				Employee e1 = q1.deQueue();
				System.out.print(e1);
				System.out.println();
				break;
				
			case 3:
				System.out.println("**** Queue of Employee ****");
				System.out.println(q1+"");
			}
		}while(ch!=0);




	}

}
