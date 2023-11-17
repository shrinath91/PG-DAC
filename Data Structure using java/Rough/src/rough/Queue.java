package rough;

public class Queue
{
	int front, rear;
	int arr[];
	int size;

	public Queue(int size)
	{
		front = -1;
		rear = -1;
		this.size = size;
		arr = new int[size];
	}

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
			if(front==-1&&rear==-1)
				front=0;

			rear=(rear+1)%size;
			arr[rear]=data;
		}
		else
			System.out.println("Queue is FULL");
	}
	public int deQueue()
	{
		if(!isEmpty())
		{
			int data=arr[front];
			
			if(front==rear)
				front=rear=-1;
			else
				front=(front+1)%size;
			return data;
		}
		else
			System.out.println("Queue is Empty");

		return -1;
	}

	public void display()
	{
		if(!isEmpty())
		{
			System.out.println("\t\t####Queue####");
			int i;
			System.out.print("| ");
			for(i=front; i!=rear; i=(i+1)%size)
			{
				System.out.print(arr[i]);
				System.out.print(" | ");

			}
			System.out.print(arr[i]);
			System.out.print(" |\n");

		}
		else
			System.out.println("Queue is Empty");
	}
}











































