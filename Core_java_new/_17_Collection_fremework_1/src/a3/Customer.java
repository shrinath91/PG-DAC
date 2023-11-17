package a3;

public class Customer
{
	String name;
	String email;
	int cont_no;
	
	public Customer(String name, String email, int cont_no)
	{
		super();
		this.name = name;
		this.email = email;
		this.cont_no = cont_no;
	}

	@Override
	public String toString()
	{
		return "Name: "+name+"\nEmail: "+email+"\nCont No: "+cont_no;
	}
	
	
	

	
}
