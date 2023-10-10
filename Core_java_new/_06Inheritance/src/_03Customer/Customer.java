package _03Customer;

import _01Person.Person;

public class Customer extends Person {

	private String email;
	private String address;
	public Customer() {
//		super();
		email="NA";
		address="NA";
	}
	public Customer(String name, int dd,int mm,int yy, String email, String address) {
		super(name, dd, mm, yy);
		this.email = email;
		this.address = address;
	}
	public double giveDiscount(double ammount)
	{
		return ammount;
	}
	public void display()
	{
		super.display();;
		System.out.println("Email: "+email);
		System.out.println("Adress: "+address);
	}
}
