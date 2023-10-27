package a1;

public class Node 
{
	private Book obj;
	private Node next;
	
	public Node(Book obj) 
	{
		super();
		this.obj = obj;
		this.next = null;
	}

	public String toString() {
		return obj+" ";
	}

	public Book getobj() {
		return obj;
	}

	public void setobj(Book obj) {
		this.obj = obj;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
	
	

}
