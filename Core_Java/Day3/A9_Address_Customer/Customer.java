class Customer
{
	private String email_id;
	private Address add;
	
	public Customer()
	{
		email_id="NA";
		add=new Address();
	}
	public Customer(String email_id,String ar, String ci, String pi)
	{
		this.email_id=email_id;
		add=new Address(ar, ci, pi);
	}
	public void displayCust()
	{
		System.out.println("Email_ID: "+email_id);
		add.displayAdd();
	}
}