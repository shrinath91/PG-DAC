class Book
{
	private int bookid;
	private static int cnt;
	private float price;
	
	{
		cnt++;
	}
	
	Book()
	{
		bookid=cnt;
	}
	Book(float price)
	{
		bookid=cnt;
		this.price=price;
	}
	
	public void display()
	{
		System.out.println("Book ID: "+bookid);
		System.out.println("Price: "+price);
	}
	
	
}