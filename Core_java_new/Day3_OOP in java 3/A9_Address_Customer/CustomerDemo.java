class CustomerDemo
{
	public static void main(String []arg)
	{
		Customer c1;
		c1=new Customer();
		c1.displayCust();
		
		Customer c2=new Customer("abc@gmail.com","Hadapsar","Pune","412307");
		c2.displayCust();
	}
}