package a4_paranthesis;


public class cStack 
{
	private int top;
	private int size;
	private char arr[];
	
	public cStack() 
	{
		top=-1;
		size=3;
		arr = new char[3];
	}

	public cStack(int size) 
	{
		top=-1;
		this.size = size;
		arr = new char[size];
	}
	
	public boolean isEmpty()
	{		
		if(top==-1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		 return false;
	}
	
	public void push(char data) 
	{
		if(!isFull())
		{
			arr[++top]=data;
		}
		else
			System.out.println("Stack is Full Paji!!!");
	}
	
	public char pop() 
	{
		char data = '\n';
		if(!isEmpty())
		{
			data = arr[top];
			top--;
			return data;
		}
		else
//			System.out.println("\t\tStack is Empty Paji!!!");
		return data;
	}
	
	public char peek() 
	{
		char data = '\n';
		if(!isEmpty())
		{
			return arr[top];
		}
		else
//			System.out.println("\t\tStack is Empty Paji!!!");
		return data;
	}
	
	public void display()
	{
		System.out.println("-------------------Stack-------------------");
//		for(int i=this.top; i>=0; i--)
		int i=top;
		while(i>=0)
		{
//			System.err.println("|"+"--"+"|");
			System.err.println("|"+arr[i]+"|");
			i--;
		}
//		System.err.println("|"+"--"+"|");
	}
	
	
	
	
	
	
	

}
