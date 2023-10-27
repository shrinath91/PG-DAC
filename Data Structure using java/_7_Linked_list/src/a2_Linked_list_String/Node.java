package a2_Linked_list_String;

public class Node {
	String data;
	Node next;
	
	public Node() {
		super();
		this.data = null;
		this.next = null;
	}
	
	public Node(String data) {
		super();
		this.data = data;
		this.next = null;
	}

	
	public String toString() {
		return data+" ";
	}
	
	

}
