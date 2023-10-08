package A1.office.utility;

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
	public void display()
	{
		System.out.println("Date: "+dd+"/"+mm+"/"+yy);
	}
	

}
