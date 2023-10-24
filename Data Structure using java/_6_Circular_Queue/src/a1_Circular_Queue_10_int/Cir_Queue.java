package a1_Circular_Queue_10_int;

public class Cir_Queue {
	private int front, rear, size;
	private int arr[];
	public Cir_Queue() 
	{
		super();
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

	private boolean isEmpty()
	{
		if(front== -1 && rear==-1)
			return true;

		return false;
	}
	private boolean isFull()
	{
		if(front == (rear+1)%size)
			return true;

		return false;
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
			//			rear++;
		}
		else
			System.out.println("Circular Queue is Full");

	}

	public int deQueue()
	{
		int data = 0;
		if(!isEmpty())
		{
			data = arr[front];
			front = (front+1)%size;
			//			front++;
		}
		else
			System.out.println("Circular Queue is Empty");

		return data;

	}

	public void display()
	{
		System.out.println("\t\t****Circular Queue****");

		for(int i=front; i!= rear+1; i=(i+1)%size )
//		for(int i=front; i!= rear; i++ )
			//		for(int i=front; i<= (rear+1)%size; i++ )
		{
			System.out.print("\t"+ arr[i]+" | ");
		}
	}



}
