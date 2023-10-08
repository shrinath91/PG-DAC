class Date
{
    private int dd;
    private int mm;
    private int yy;
	private int n;
	private static int cnt;

	{
		cnt++;
	}
    public Date()
	{
		n=cnt;
		dd=1;mm=0;yy=0;
	}

    public Date(int dd, int mm, int yy)
	{
		n=cnt;
		this.dd=dd; 
		this.mm=mm; 
		this.yy=yy;
	}

    public Date(Date d)
	{
		n=cnt;
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.mm;
	}
   
    public void showDate()
    {
        System.out.println("Date "+n+":" +dd+"/"+mm+"/"+yy);
    }
}