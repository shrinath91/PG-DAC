package double_End_queue;

public class cQueue_dobleEnd
{
	Node front;
	Node rear;
	
	public cQueue_dobleEnd()
	{
		rear=front=null;
	}

	public void enQueueFront(int data)
	{
		Node n1 = new Node(data);
		
		if(rear==null && front==null)
		{
			front=rear=n1;
		}
		else
		{
			n1.next=front;
			front=n1;
		}
	}
	public void enQueueRear(int data)
	{
		Node n1 = new Node(data);
		
		if(rear==null && front==null)
		{
			front=rear=n1;
		}
		else
		{
			Node mv=front;
			while(mv.next!=null)
				mv=mv.next;
			
			mv.next=n1;
			rear=n1;
		}
	}
	public int deQueueFront(int data)
	{
		int data;
		if(front==null && rear==null)
		{
			throw new QueueEmptyException();
		}
	}
	
	
	
	
	
	
}
