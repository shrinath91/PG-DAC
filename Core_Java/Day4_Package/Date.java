package office.utility;

public class Date
{
    private int dd;
    private int mm;
    private int yy;
	
    public Date()
	{
		dd=1;mm=0;yy=0;
	}

    public Date(int dd, int mm, int yy)
	{
		this.dd=dd; 
		this.mm=mm; 
		this.yy=yy;
	}

    public Date(Date d)
	{
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.mm;
	}
   
    public void showDate()
    {
        System.out.println("Date :" +dd+"/"+mm+"/"+yy);
    }
}