package a1_stack;

//import a1_stack.cStack;
import java.util.Scanner;

import a4_paranthesis.cStack;


public class Demo { 

	public static void main(String[] args)   
	{
//		a1_stack.cStack c = new a1_stack.cStack(5);
		cStack1 c = new cStack1(5);
 		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\t1. Push");
			System.out.println("\t2. Pop");
			System.out.println("\t3. Peek");
			System.out.println("\t4. Display");
			System.out.println("\t0. Exit");
			System.out.println("\t####Enter Your choice####");
			
			choice = sc.nextInt();
			int data;
			switch (choice) 
			{
				case 1: 
					System.out.print("Enter data to Push:");
					data = sc.nextInt();
					c.push(data);
					break;
					
				case 2: 
					data = c.pop();
					System.out.println("Deleted Element: "+data);
					break;
					
				case 3: 
					data = c.peek();
					System.out.println("Top Element: "+data);					
					break;
					
				case 4: 
					c.display();
					break;
				
		
				default:
					System.out.println("Paji Thank you for using Our Application");
					break;
			}
			
			
		}while(choice!=0);
		
		sc.close();

	}

}
