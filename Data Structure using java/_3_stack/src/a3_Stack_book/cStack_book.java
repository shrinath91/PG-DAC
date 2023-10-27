package a3_Stack_book;

public class cStack_book 
{

	private int top;
	private int size;
	private Book arr[];
	
	public cStack_book() 
	{
		top = -1;
		size = 3;
		arr = new Book[3];
	}

	public cStack_book(int size) 
	{
		top = -1;
		this.size = size;
		arr = new Book[size];
	}
	
	public boolean isEmpty()
	{		
		if(top == -1)
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
	
	public void push(Book data) 
	{
		if(!isFull())
		{
			arr[++top] = data;
		}
		else
			System.out.println("Stack is Full Paji!!!");
	}
	
	public Book pop() 
	{
		Book data = null;
		if(!isEmpty())
		{
			data = arr[top];
			top--;
			return data;
		}
		else
			System.out.println("\t\tStack is Empty Paji!!!");
		return data;
	}
	
//	public int peek() 
//	{
//		Book data = null;
//		if(!isEmpty())
//		{
//			return arr[top];
//		}
//		else
//			System.out.println("\t\tStack is Empty Paji!!!");
//		return data;
//	}
	
	public void display()
	{
		System.out.println("-------------------Book Stack-------------------");
		
		for(int i=top; i>=0; i--)
		{
			System.out.print(arr[i]);
		}
	}
	
	
}
 
 

