package _01Person;


public class Date {
	private int dd;
	private int mm;
	private int yy;
	public Date() {
		super();
	}
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public Date(Date d) {
		super();
		this.dd = d.dd;
		this.mm = d.mm;
		this.yy = d.yy;	
	}
	
	public String toString()
	{
		return "Birthdate: "+dd+"/"+mm+"/"+yy;
	}
//	public void display()
//	{
//		System.out.println("Birthdate: "+dd+"/"+mm+"/"+yy);
//	}

}
