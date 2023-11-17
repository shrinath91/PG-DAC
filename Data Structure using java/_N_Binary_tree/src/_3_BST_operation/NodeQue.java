package _3_BST_operation;

public class NodeQue {

	Node data;
	int front;
	int rear;
	int size;
	Node arr[];

	public NodeQue(int size) 
	{
		this.front = -1;
		this.rear = -1;
		this.size = size;
		this.arr = new Node[size];
	}
	public boolean isFull()
	{
		return rear==size-1?true:false;
	}
	public boolean isEmpty()
	{
		return front==-1?true:false;
	}
	public void enQueue(Node data)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return;
		}
		if(rear==-1)
		{
			front=0;
		}

		rear++;
		arr[rear]=data;

	}
	public Node deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return null;
		}

		Node data = arr[front];
		if(front==rear)
			front=rear=-1;
		else
			front++;
		return data;
	}



}
