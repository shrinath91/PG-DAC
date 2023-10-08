class Address
{
	private String area;
	private String city;
	private String pin;
	
	public Address()
	{
		area="NA";
		city="NA";
		pin="NA";
	}
	public Address(String area, String city, String pin)
	{
		this.area= area;
		this.city= city; 
		this.pin= pin;
	}
	
	public void displayAdd()
	{
		System.out.println("Area: "+area);
		System.out.println("City: "+city);
		System.out.println("Pin_Code: "+pin);
	}
	
}