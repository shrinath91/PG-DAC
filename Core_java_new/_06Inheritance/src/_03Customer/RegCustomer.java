package _03Customer;

class RegCustomer extends Customer {
	private int reg_no;

	public RegCustomer() {
		super();
	}

	public RegCustomer(String name, int dd,int mm,int yy, String email, String address, int reg_no) {
		super(name, dd, mm, yy, email, address);
		this.reg_no = reg_no;
	}
	
	public double giveDiscount(double ammount)
	{
		return ammount-(ammount*0.05);
	}
	
	public void display()
	{
		super.display();
		System.out.println("Reg. NO: "+reg_no);
	}
	
	

}
