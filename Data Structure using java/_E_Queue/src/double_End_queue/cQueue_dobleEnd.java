package double_End_queue;

public class cQueue_dobleEnd
{
	Node front;
	Node rear;

	public cQueue_dobleEnd()
	{
		rear=front=null;
	}
	public boolean isEmpty()
	{
		return rear==null && front==null ?true:false;
	}

	////////////////////////////////////////////
	public void enQueueFront(int data)
	{
		Node n1 = new Node(data);

		if(isEmpty())
		{
			front=rear=n1;
		}
		else
		{
			n1.next=front;
			front=n1;
		}
	}
	////////////////////////////////////////////
	public void enQueueRear(int data)
	{
		Node n1 = new Node(data);

		if(isEmpty())
		{
			front=rear=n1;
		}
		else
		{
//			Node mv=front;///think7
//			while(mv.next!=null)
//				mv=mv.next;
//			
//			mv.next=n1;
//			rear=n1;////not needed

			rear.next=n1;
			rear=n1;
		}
	}
//	public void enQueueRear(int data)
//	{
//		Node n1 = new Node(data);
//		
//		if(isEmpty())
//		{
//			front=rear=n1;
//		}
//		else
//		{
//			Node mv=front;///think7
//			while(mv.next!=null)
//				mv=mv.next;
//			
//			mv.next=n1;
//			rear=n1;
//		}
//	}
	////////////////////////////////////////////
	public int deQueueFront() throws QueueEmptyException
	{
		int data;
		if(isEmpty())
		{
//			System.err.println("Queue is Empty!!!");
//			return -1;
			throw new QueueEmptyException();
		}
		else
		{
			if(front.next==null)
			{
				data=front.data;
				front=rear=null;
				return data;
			}
			data=front.data;
			front=front.next;

			return data;	
		}
	}
	////////////////////////////////////////////
	public int deQueueRear()
	{
		int data;
		if(isEmpty())
		{
			System.err.println("Queue is Empty!!!");
			return -1;
		}

		Node mv = front;

		if(mv.next==null)
		{
			data=mv.data;
			Node del = front;
			front=rear=null;
			del=null;
		}
		else 
		{
			while(mv.next.next!=null)
				mv=mv.next;

			data=mv.next.data;
			//			Node del = mv.next;
			rear=mv;
			rear.next=null;
			//			del=null;
		}
		return data;					

	}


	////////////////////////////////////////////
	@Override
	public String toString()
	{
		//		if(isEmpty())
		//		{
		//			return "Queue is Empty!!!";
		//		}
		String str="| ";
		Node mv=front;
		while(mv.next!=null)
		{
			str+=mv.data+" |-->| ";
			mv=mv.next;

		}
		str = str+mv.data+" |\n";
		return str;

	}





}
