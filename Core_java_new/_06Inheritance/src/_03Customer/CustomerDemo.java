package _03Customer;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ammount;
		
		
		System.out.println("Enter Type of Customer:\n1.Customr\n2.Regular Customer");
		int choice = sc.nextInt();
		if(choice==1)
		{
			Customer c1= new Customer("Shrinath",12,4,97,"abc@gmail.com", "Pune");
			System.out.print("Enter ammount: ");
			ammount = sc.nextDouble();
			c1.display();
			System.out.println("Final Ammount: "+c1.giveDiscount(ammount));
		}
		else if(choice==2)
		{
			Customer c2 = new RegCustomer("Mukesh",13,4,2001,"xyz@gmail.com", "Pune",1275);
			System.out.print("Enter ammount: ");
			ammount = sc.nextDouble();
			c2.display();
			System.out.println("Final Ammount: "+c2.giveDiscount(ammount));
		
		}
		sc.close();
		
		
	}

}
