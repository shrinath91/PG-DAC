package a1_queue_10_interger;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int ch, size, data;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Queue:");
		size = sc.nextInt();
		cQueue q = new cQueue(size);
		
		
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
				 System.out.print("Enter a data to enQueue: ");
				 data = sc.nextInt();
				 q.enQueue(data);
				 break;
				 
			 case 2:
				 data = q.deQueue();
				 System.out.println("Deleted data is"+ data);
				 break;
				 
			 case 3:
				 q.display();
				 break;
				 
			 case 0:
				 System.out.println("Seva upabhoglya karita dhanyavad!!!");
				 break;
				 
			 }
			
		}while(ch!=0);
		sc.close();
	}

}
