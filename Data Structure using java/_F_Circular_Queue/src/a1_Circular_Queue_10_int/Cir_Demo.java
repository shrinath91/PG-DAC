package a1_Circular_Queue_10_int;

import java.util.Scanner;

public class Cir_Demo {

	public static void main(String[] args) {

		int data;
		int ch;
		Cir_Queue queue=new Cir_Queue(5);
		Scanner sc=new Scanner(System.in);

		do
		{
			System.out.println(" 1. Insert ");
			System.out.println(" 2. Delete ");
			System.out.println(" 3. Display ");
			System.out.println(" 0. Exit ");
			System.out.println(" Enter Your Choice  ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 :
				System.out.println("Enter data ");
				data=sc.nextInt();
				queue.enQueue(data);
				break;
				
			case 2:
				data=queue.deQueue();
				if(data==-999)
					System.out.println("Queue Is Empty ");
				else
					System.out.println(data);
				break;
				
			case 3:
				queue.display();
				break;
			}
		}while(ch!=0);
		
		sc.close();
	}

}


