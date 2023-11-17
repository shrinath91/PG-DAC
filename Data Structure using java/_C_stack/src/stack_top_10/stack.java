package stack_top_10;

public class stack 
{
	int size;
	int top;
	int arr[];
	
	public stack() {
		super();
		this.size = 5;
		this.top = 10;
		this.arr = new int[size];
	}
	
	public boolean isEmpty()
	{
		return top==10?true:false;
	}
	
	public boolean isFull()
	{
		return top-11==size-1?true:false;
	}
	
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("Full");
			return;
		}
		
		top++;
		arr[top-11]=data;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
			return -1;
		}
		
		int data=arr[top-11];
		top--;
		return data;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
			return;
		}
		
		System.out.println("-------------------Array-------------------");

		int i=top-11;
		while(i>=0)
		{
			System.out.println("|"+"--"+"|");
			System.out.println("|"+arr[i]+"|");
			i--;
		}
		System.out.println("|"+"--"+"|");
	}
	
	
	
	
}
