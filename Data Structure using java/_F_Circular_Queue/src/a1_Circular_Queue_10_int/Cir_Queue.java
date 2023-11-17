package a1_Circular_Queue_10_int;

public class Cir_Queue {
	private int front, rear, size;
	private int arr[];
	public Cir_Queue() 
	{
		this.front = -1;
		this.rear = -1;
		this.size = 3;
		this.arr = new int[3];
	}

	public Cir_Queue(int size) 
	{
		this.front = -1;
		this.rear = -1;
		this.size = size;
		this.arr = new int[size];
	}

//	private boolean isEmpty()
//	{
//		if(front== -1 && rear==-1)
//			return true;
//
//		return false;
//	}
//	private boolean isFull()
//	{
//		if(front == (rear+1)%size)
//			return true;
//
//		return false;
//	}
	public boolean isEmpty()
	{
		return front==-1 && rear==-1?true:false; 
	}
	public boolean isFull()
	{
		return front==(rear+1)%size?true:false;
	}

	public void enQueue(int data)
	{
		if(!isFull())
		{
			if(rear==-1 && front==-1) 
			{
				front = 0;
			}
			rear = (rear+1)%size;
			arr[rear] = data;
			//rear++;
		}
		else
			System.out.println("Circular Queue is Full\n");

	}

	public int deQueue()
	{
		int data = 0;
		if(!isEmpty())
		{
			data = arr[front];

			if(front == rear)//
			{front = -1; rear = -1;}//
			else
				front = (front+1)%size;
			
		}
		else
			System.out.println("Circular Queue is Empty\n");

		return data;

	}

	public void display()
	{
		int i;
		System.out.println("\t\t****Circular Queue****");
		if(!isEmpty()) 
		{
			System.out.print("\t| ");
			for(i=front; i!=rear; i=(i+1)%size )
			{
				System.out.print("\t"+ arr[i]+"\t| ");
			}
			System.out.print("\t"+ arr[i]+"\t| \n");
		}
		else
			System.out.println("Circular Queue is Empty\n");

	}



}
