package a2;

public class MyLinkedList_Sort 
{
	Node head;

	public MyLinkedList_Sort() 
	{
		head = null;
	}
	
	
	public void addNode(int data)
	{
		Node newNd = new Node(data);
		if(head==null)
		{
			head = newNd;
		}
		else if(newNd.data < head.data)
		{
			newNd.next = head;
			head = newNd;
		}
		
		else
		{
			Node mv = head;
			while(mv.next!=null)
			{
				if(mv.data < newNd.data && newNd.data < mv.next.data)
				{
					newNd.next = mv.next;
					mv.next = newNd;
					break;
				}
				mv = mv.next;
			}
			if(mv.next==null)
			{
				mv.next = newNd;
			}
		}
		
		
	}
	
	public void display()
	{
		Node mv = head;
		while(mv.next!=null)
		{
			System.out.print(mv);
			System.out.print("->");
			mv = mv.next;
		}
		System.out.print(mv);
	}
	
	

}
