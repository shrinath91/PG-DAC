package _10_Doubly_Linked_List;

import java.util.Scanner;

public class DoublyLL 
{
	public static class Node 
	{
		int data;
		Node prev;
		Node next;
		public Node(int data) 
		{
			this.prev = null;
			this.data = data;
			this.next = null;
		}

		public String toString() {
			return data+"";
		}	
	}

	private Node head;

	public DoublyLL() 
	{
		this.head = null;
	}
	public int size()
	{
		Node mv = head;
		int count=1;
		while(mv.next!=null)
		{
			count++;
			mv=mv.next;
		}
		return count;
	}

	public void addNode(int data)
	{
		Node n1 = new Node(data);
		if(head==null)
			head =  n1;
		else
		{
			Node mv = head;
			while(mv.next!=null)
			{
				mv = mv.next;
			}
			mv.next = n1;
			n1.prev = mv;
		}
	}
	public void createLinkedList(int size)
	{
		int data;
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=size; i++)
		{
			System.out.print("Enter data to add: ");
			data = sc.nextInt();
			addNode(data);
		}
//				sc.close();
	}

	public void createPrimeLinkedList(int size)
	{

		int num = 2;
		for(int i=1; i<=size;)
		{
			boolean flag = true;
			for(int j=2; j<num; j++)
			{
				if(num%j==0)
					flag=false;
				break;
			}

			if(flag)
			{
				addNode(num);
				num++;
				i++;
				continue;
			}
			num++;

		}

		//		sc.close();
	}

	public void display()
	{
		Node mv = head;

		System.out.print("| ");
		while(mv.next!=null)
		{
			System.out.print(mv+" |<-->| ");
			mv = mv.next;
		}
		System.out.println(mv+" |\n");
	}

	public void insertPos(int pos, int data)
	{
		Node n1 = new Node(data);
		Node mv = head;

		if(pos<=0 || pos<size()+1)
		{
			System.out.println("Invalid Pos!!!");
			return;
		}

		if(pos==1)
		{
			if(head==null)
			{
				head = n1;
			}
			else 
			{
				n1.next=head;
				head.prev=n1;
				head=n1;
			}

		}
		else 
		{
			for(int i=1; i<pos-1; i++)
			{
				mv=mv.next;
			}

			n1.next = mv.next;

			if(mv.next!=null)
				mv.next.prev = n1;

			n1.prev = mv;
			mv.next = n1;
		}

	}

	public void deleteData(int data)
	{
		if(head.data==data)
		{
			if(head.next==null)
			{
				head=null;
			}
			else
			{
				head = head.next;
				head.next.prev=null;
			}
		}
		else
		{
			Node mv = head;
			while(mv.next.data!=data)
			{
				mv=mv.next;
			}

//			Node del = mv.next;
			if(mv.next.next!=null)
			{
		
				mv.next = mv.next.next;
				mv.next.prev=mv;
			}
				
			else
				mv.next = null;//means assign null
		}
	}
	
	public void reverseDisplay()
	{
		Node mv = head;
		while(mv.next!=null)
			mv=mv.next;
		
		System.out.print("| ");
		while(mv.prev!=null)
		{
			System.out.print(mv+" |<-->| ");
			mv = mv.prev;
		}
		System.out.println(mv+" |\n");

	}
	
	public void displayPos(int data)
	{
		Node mv = head;
		int count = 1;
		
		while(mv.data!=data)
		{
			mv = mv.next;
			count++;
		}
		
		if(mv.data == data)
		{
			System.out.println("Data Found at: "+count);
		}
		else
			System.out.println("Data not found!!!");
	}


}
