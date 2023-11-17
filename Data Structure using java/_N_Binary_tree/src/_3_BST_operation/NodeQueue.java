package _3_BST_operation;

public class NodeQueue {
	Node data;
	int size;/////////shubh
	int front;
	int rear;
	Node arr[];
	
	
	public NodeQueue(int size)
	{
		this.data = null;
		this.size = size;
		this.front = -1;
		this.rear = -1;
		arr = new Node[size];
	}
	
	public void enqueue(Node data)
	{
		if(isFull()) {
			System.out.println("queue full!!");
			return;
		}
		if(front == -1) {
			front = 0;
		}
		rear++;
		arr[rear] = data;
	}
	public Node dequeue() {
		if(isEmpty()) {
			return null;
		}
		Node data = arr[front];
		if(front == rear) 
		{
			front = rear = -1;
		}
		else 
		{
			front++;
		}
		return data;
	}
	public boolean isEmpty() {
		return front == -1 ? true:false;
	}
	public boolean isFull() {
		return rear == size-1 ? true:false;
	}
	
	
	

}
