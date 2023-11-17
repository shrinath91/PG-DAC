package b_seperate_odd_even;

public class MyLinkedList 
{
	Node head;
	Node odd;

	public MyLinkedList() {
		head = null;
		odd = null;
	}

	public void addNode(int data)
	{
		Node record = new Node(data);
		if(head == null)
			head = record;
		else
		{
			Node move;
			for(move = head; move.next != null; move = move.next);

			move.next = record;
		}

	}

	public void createLinkedList(int size)
	{
		int num = 5;

		for(int i=1; i<=size; i++)
		{
			addNode(num);
			num+=5;
		}
	}

	public void display()
	{
		Node move;
		System.out.println("\t**** Linked List ****");

		for(move=head; move.next!=null; move=move.next)
		{
			System.out.print(move.data+" ");
		}
		System.out.println(move.data+" ");
		System.out.println("");
	}
	public void addEnd(Node temp)
	{
		Node mv=head;
		while(mv.next!=null)
			mv=mv.next;

		mv.next=temp;
	}
	public Node add_AtOdd(Node temp)
	{
		if(odd==null)
		{
			odd=temp;
			temp.next=null;
			return odd;
		}

		Node mv = odd;
		while(mv.next!=null)
			mv=mv.next;

		mv.next=temp;
		temp.next=null;

		return odd;

	}

	public void seperateEvenOdd()
	{
		Node temp_node=null;
		Node temp=null;
		Node mv=head;
		while(head.data%2!=0)/////cond for head odd
		{
			Node temp_head=head;
			head=head.next;
			temp=add_AtOdd(temp_head);

		}
		
		mv=head;
		while(mv.next!=null)////cond for mid 
		{
			if(mv.next.data%2!=0)
			{
				temp_node=mv.next;
				if(mv.next.next==null)
				{
					mv.next=null;
					temp=add_AtOdd(temp_node);
					continue;
				}
				mv.next=mv.next.next;
				temp=add_AtOdd(temp_node);
			}
			mv=mv.next;
		}
		

		mv=head;
		while(mv.next!=null)
			mv=mv.next;

		mv.next=temp;

//		4 5 6 3 1 3 1 3 1 3 
	}



}
//
//Node temp=null;
//
//Node mv=head;
//while(mv.next!=null)
//	mv=mv.next;
//if(head.data%2!=0)
//{
//	while(head.data%2!=0)
//	{
//		temp=head;
//		head=head.next;
//		add_AtOdd(temp);
//	}
//}
//Node mv1=head.next;
//temp=head;
//while(mv1!=mv)
//{
//	if(mv1.data%2!=0)
//	{
//		add_AtOdd(mv1);
//		temp.next=mv1.next;
//		System.out.println("hey");
//
//	}
//	System.out.println("hello");
//	temp=temp.next;
//	if(mv1.next!=null)
//		mv1=mv1.next;
//}
