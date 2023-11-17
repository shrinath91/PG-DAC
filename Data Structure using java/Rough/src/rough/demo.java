package rough;

import java.util.Scanner;


public class demo
{

	public static void main(String[] args)
	{
		int size;
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		size = sc.nextInt();
		Queue q1 = new Queue(size);

		do {
			System.out.println(" 1. Insert ");
			System.out.println(" 2. Delete ");
			System.out.println(" 3. Display ");
			System.out.println(" 0. Exit ");
			System.out.println(" Enter Your Choice  ");
			ch = sc.nextInt();

			switch(ch)
			{
			case 1:
				System.out.print("Enter Data:");
				int data = sc.nextInt();
				q1.enQueue(data);
				break;

			case 2:
				System.out.println("Deleted data: "+q1.deQueue());
				break;

			case 3:
				q1.display();
				break;

			case 0:
				break;
			}

		}while(ch!=0);
		sc.close();
	}

}
