package a1_employee;

public class Node
{
	Employee data1;
	Node next;
	
	public Node(Employee data)
	{
		this.data1 = data;
		this.next = null;
	}

	@Override
	public String toString()
	{
		return data1+"";
	}
		
}
