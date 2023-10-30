package a2_polynomial;

public class Node
{
	Polynomial data;
	Node next, pre;
	
	public Node(Polynomial data)
	{
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString()
	{
		return data+"";
	}
	
	
	
	
}
