package a3;

public class RegCustomer extends Customer
{
	int reg_no;

	public RegCustomer(String name, String email, int cont_no, int reg_no)
	{
		super(name, email, cont_no);
		this.reg_no = reg_no;
	}

	@Override
	public String toString()
	{
		return super.toString()+"\nRegister NO: "+reg_no;
	}
	
	
}
