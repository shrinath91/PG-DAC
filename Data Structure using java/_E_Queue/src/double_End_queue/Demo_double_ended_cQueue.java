package double_End_queue;

import java.util.Scanner;


public class Demo_double_ended_cQueue
{

	public static void main(String[] args)
	{
		int ch, data=0;
		cQueue_dobleEnd c1 = new cQueue_dobleEnd();
		Scanner sc=new Scanner(System.in);

		System.out.println(" 1.	enQueueFront  ");
		System.out.println(" 2.	enQueueRear  ");
		System.out.println(" 3.	deQueueFront  ");
		System.out.println(" 4.	deQueueRear  ");
		System.out.println(" 5.	Display  ");
		System.out.println(" 0. Exit");

		do
		{
			System.out.println("\nPress \"7\" for Menu");
			System.out.print("#Enter Your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("Enter data: ");
				data=sc.nextInt();
				c1.enQueueFront(data);
				System.out.println(c1);
				break;

			case 2:
				System.out.print("Enter data: ");
				data=sc.nextInt();
				c1.enQueueRear(data);
				System.out.println(c1);
				break;

			case 3:
				
				System.out.print("Deleted data: ");
				try
				{
				data = c1.deQueueFront();					
				}
				catch(QueueEmptyException q)
				{
					q.printStackTrace();
				}
				
				System.out.println(data);
				if(!c1.isEmpty())
					System.out.println(c1);
				break;

			case 4:
				System.out.print("Deleted data: ");
				data = c1.deQueueRear();
				System.out.println(data);
				if(!c1.isEmpty())
					System.out.println(c1);
				break;

			case 5:
				System.out.println("**** Queue ****");
				if(!c1.isEmpty())
				{
					System.out.println(c1);
				}
				else
					System.err.println("Queue is Empty!!!");
				break;
				
			case 7:
				menu();
			}
		}while(ch!=0);

	}

	public static void menu()
	{
		System.out.println(" 1.	enQueueFront  ");
		System.out.println(" 2.	enQueueRear  ");
		System.out.println(" 3.	deQueueFront  ");
		System.out.println(" 4.	deQueueRear  ");
		System.out.println(" 5.	Display  ");
		System.out.println(" 0. Exit");
	}

}
