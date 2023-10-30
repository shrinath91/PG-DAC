package a1;

public class Book 
{
	private int id;
	private String name;
	
	
	
	public Book() {
		super();
		this.id = '\n';
		this.name = null;
	}


	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public String toString() {
		
		return "Book ID: "+id+"\n" +"Name: "+name;
	}
	
	
	
	
}
