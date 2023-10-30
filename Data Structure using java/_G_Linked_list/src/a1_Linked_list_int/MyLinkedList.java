package a1_Linked_list_int;

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
			System.out.print(move.data+" ");
		}
		System.out.println(move.data+" ");
		System.out.println("");
	}
	
	
	

}
