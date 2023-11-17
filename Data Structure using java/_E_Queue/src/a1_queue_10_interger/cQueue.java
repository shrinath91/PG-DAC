package a1_queue_10_interger;

public class cQueue {
	private int front, rear;
	private int arr[];
	private int size;
	public cQueue() {
		super();
		this.front = -1;
		this.rear = -1;
		this.size = 3;
		this.arr = new int[3];
	}
	public cQueue(int size) {
		super();
		this.front = -1;
		this.rear = -1;
		this.size = 3;
		this.arr = new int[3];
	}
	
//	private boolean isEmpty()
//	{
//		if(front == -1)
//			return true; 
//		
//		return false;
//		
//	}
//	private boolean isFull()
//	{
//		if(rear==size-1)
//			return true;
//		
//		return false;
//	}
	
	public boolean isEmpty()
	{
		return front==-1?true:false;
	}
	public boolean isFull()
	{
		return rear==size-1?true:false;
	}
	
	public void enQueue(int data)
	{
		if(!isFull())
		{
			if(front==-1)
				front = 0;
			
			arr[++rear] = data;
				
		}
		else
			System.out.println("Queue is Full!!");
	}
	
	public int deQueue()
	{
		int data = '\n';
		if(!isEmpty())
		{
			data = arr[front];
			
			if(front==rear)
				front=rear=-1;
			else
				front++;
		}
		else
			System.out.println("Queue is empty");
		
		
		return data;
	}
	
	public void display()
	{
		if(!isEmpty())
		{
			System.out.println("\t\t####Queue####");
			for(int i=front; i<=rear; i++)
			{
				System.out.print("| ");
				System.out.print("front:"+i+" "+ arr[i]);
				System.out.print(" |");
			}
			System.out.println("\n");
		}
	}
	
	
	

}
