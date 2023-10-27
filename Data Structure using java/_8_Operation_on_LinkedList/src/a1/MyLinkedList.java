package a1;

public class MyLinkedList {
	Node head;

	public MyLinkedList() {
		head = null;
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
			System.out.print(move.data+"->");
		}
		System.out.println(move.data+" ");
		System.out.println("");
	}

	public void delete(int data)
	{
		boolean flag = false;
		Node del;
		if(head.data == data)
		{
			del = head;
			head = head.next;
			del = null;
			flag = true;
		}
		else
		{
			Node mv = head;
			while(mv.next != null)
			{
				if(mv.next.data == data)
				{
					mv.next = mv.next.next;
					flag = true;
					break;
				}
				mv = mv.next;				
			}	
		}
		if(!flag)
			System.out.println("Kuch dhang ka Position dijiye>>>Not Present");
	}

	public void printReverseOrder(Node mv)
	{
		if(mv!=null)
		{
			printReverseOrder(mv.next);
			System.out.print(mv.data+" ");
		}

	}

	public void insertAtPos(int pos, int data)
	{
		Node nwnode = new Node(data);

		if(pos>0 && pos < size())
		{
			if(pos==1)
			{
				nwnode.next = head;
				head =  nwnode;
			}
			else
			{
				Node mv = head;
				for(int i=1; i<pos-1; i++)
				{
					mv = mv.next;
				}
				nwnode.next = mv.next;
				mv.next = nwnode;
				
			}
		}
		else
			System.out.println("Invalid Position");


	}

	public int size()
	{
		int size=0;

		for(Node mv = head; mv!=null; mv=mv.next,size++);

		return size;
	}
	
	public int findMidValue()
	{
		Node slow = head;
		Node fast = head;
		
//		while( fast!=null && fast.next!=null )
//		{
//			slow = slow.next;
//			fast = fast.next.next;			
//		}
		while(fast.next!=null )
		{
			slow = slow.next;
			fast = fast.next.next;			
		}
		
		return slow.data;
	}
//	Exception in thread "main" java.lang.NullPointerException: Cannot read field "next" because "fast" is null
//	at _8_Operation_on_LinkedList/a1.MyLinkedList.findMidValue(MyLinkedList.java:136)
//	at _8_Operation_on_LinkedList/a1.Demo_LinkedList.main(Demo_LinkedList.java:66)
//
//	
	

}
















