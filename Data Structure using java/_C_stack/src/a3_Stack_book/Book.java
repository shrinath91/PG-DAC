package a3_Stack_book;

public class Book {
	private int bid;
	 private String bname;
	 private double price;
	 
	public Book() 
	{
		super();
		this.bid = 0;
		this.bname = "NA";
		this.price = 0;

	}

	public Book(int bid, String bname, double price) 
	{
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;

	}

	
	public String toString() {
		return "\tBook id:"+bid+"\tBook Name: "+bname+"\tPrice: "+price;
	}
	
}

