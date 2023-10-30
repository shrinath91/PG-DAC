package a1_employee;

public class cQueue
{
	Node front, rear;

	public cQueue()
	{
		front=rear=null;
	}
	public boolean isEmpty()
	{
		return rear==null?true:false;
	}
	public void enQueue(Employee data)
	{
		Node n1 = new Node(data);
		
		if(rear==null)
		{
			front=rear=n1;
		}
		else
		{
			rear.next=n1;
			rear=n1;
		}
	}
	public Employee deQueue()
	{	
		if(isEmpty())
		{
			throw new QueueEmptyException();
		}
		Employee data;
		data=front.data1;
		front=front.next;
		
		return data;		
	}
	@Override
	public String toString()
	{
		String str="";
		Node mv = front;
		while(mv.next!=null)
		{
			str+=mv.data1+"--->";
			mv = mv.next;
		}
		str+=mv;
		return str;
	}
	
	
	
	
	
}
