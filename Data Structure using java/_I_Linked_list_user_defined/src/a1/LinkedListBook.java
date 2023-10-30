package a1;

import java.util.Scanner;

public class LinkedListBook 
{
	Node head;

	public LinkedListBook() {
		this.head = null;
	}
	
	public void addNode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Name: ");
		String name; 
		name = sc.nextLine();
		
		System.out.print("Enter Book ID: ");
		int id = sc.nextInt();
		//System.out.println();
		
		
		Book obj = new Book(id, name);
		Node newNd = new Node(obj);
		
		if(head==null)
		{
			head = newNd;
		}
		else
		{
			Node mv=head;
			while(mv.getNext()!=null)
			{
				mv = mv.getNext();
			}
			mv.setNext(newNd);
		}
	}
	public void display()
	{	
		System.out.println("\t*****Linked list*****\n");
		Node mv = head;
		
		while(mv!=null)
		{
			System.out.println(mv);
			mv = mv.getNext();
			
			if(mv!=null)
			{
				System.out.println("    |");
				System.out.println("    v");
			}
		}
		
	}
	public void createLinkedList(int size)
	{
		for(int i=1; i<=size; i++)
		{
			addNode();
		}
		
	}

}


























