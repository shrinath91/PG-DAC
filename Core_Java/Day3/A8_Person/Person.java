class Person
{
	private String name;
	private Date bdate;
	
	public Person()
	{
		//name="Empty"; //or
		name= new String("Empty");
		bdate=new Date();//date obj is created on heap and default constructor is called
	}
	public Person(String name, int dd, int mm, int yy)
	{
		this.name=name;
		this.bdate=new Date(dd, mm, yy);
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		//System.out.println("bdate: "+bdate);
		bdate.showDate();
	}
	
}