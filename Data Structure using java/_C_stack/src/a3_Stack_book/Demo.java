package a3_Stack_book;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		int bid;
		String bname;
		double price;
		
		cStack_book s1=new cStack_book(5);
		int ch;
		Book data;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\t1. Push");
			System.out.println("\t2. Pop");
			System.out.println("\t3. Peek");
			System.out.println("\t4. Display");
			System.out.println("\t0. Exit");
			System.out.println("\t1. Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter Data about book to Insert:\n1.Book Id \t2.Book name\tPrice: ");
				bid=sc.nextInt();
				bname=sc.next();
				price=sc.nextDouble();
				
				data=new Book(bid, bname, price);
				s1.push(data);
				break;
			case 2:
				data=s1.pop();
				if(data==null)
					System.out.println("Stack Is empty ");
				else
					System.out.println("Deleted Ele Is "+data);
				break;
			case 4:
				s1.display();
					break;
				
			}
		}
		while(ch!=0);
		sc.close();
	}

}
