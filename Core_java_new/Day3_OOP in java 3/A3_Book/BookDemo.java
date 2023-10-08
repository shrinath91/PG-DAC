class BookDemo
{
	public static void main(String []args)
	{
		Book b1;
		b1=new Book();
		b1.display();
		
		Book b2;
		b2=new Book(200);
		b2.display();
		
		Book b3;
		b3=new Book(3000);
		b3.display();
	}
}