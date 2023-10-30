package a2_Linked_list_String;

public class MyLinkedList {
	Node head;
	char ch = 'A';

	public MyLinkedList() {
		head = null;
	}
	
	public void addNode(String data)
	{
		Node record = new Node(data);
		if(head == null)
			head = record;
		else
		{
			Node mv;
			for(mv=head; mv.next!=null; mv=mv.next);
			
			mv.next = record;
		}
	}
	
	public void createLinkedList(int size, String data)
	{	
		for(int i=1; i<=size; i++)
		{
			addNode(data);
			ch+=1;
		}
	}
	
	public void addNodeBeg(String data)
	{
		Node record = new Node(data);
		record.next=head;
		head = record;
	}
	public void addNodeEnd(String data)
	{
		Node record = new Node(data);
		Node mv;
		for(mv=head; mv.next!=null; mv=mv.next);
			
		mv.next = record;
	}
	
	public void displayFirstNode()
	{
		System.out.println(head+" ");
	}

	public void displayLastNode()
	{
		Node mv;
		for(mv=head; mv.next!=null; mv=mv.next);
		
		System.out.println(mv+" ");
	}
	
	public int countSize()
	{
		int count = 0;
		Node mv;
		for(mv=head; mv.next!=null; mv=mv.next)
		{
			count++;
		}
		return count;
	}
	
	/////
	public void display()
	{
		Node mv;
//		System.out.println(mv+" ");
//		for(mv = head; mv.next!=null; mv=mv.next)//
//		{
//			System.out.println(mv.data+" ");			
//		}
//		System.out.println(mv.data+" ");
		for(mv = head; mv.next!=null; mv=mv.next)//using toString
		{
			System.out.println(mv+" ");			
		}
	}
	

}
