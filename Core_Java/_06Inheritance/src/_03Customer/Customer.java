package _03Customer;

import _01Person.Person;

public class Customer extends Person {

	private String email;
	private String address;
	public Customer() {
		super();
		email="NA";
		address="NA";
	}
	public Customer(String email, String address) {
		super();
		this.email = email;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Email: "+email);
		System.out.println("Adress: "+address);
	}
}
