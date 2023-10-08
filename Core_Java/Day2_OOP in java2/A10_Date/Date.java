class Date
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
		this.dd=dd; this.mm=mm; this.yy=yy;
	}

    public Date(Date d)
	{
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.mm;
	}
   
    public void showDate()
    {
        System.out.println("Date: "+dd+"/"+mm+"/"+yy);
    }
    public void showDate(char ch)
    {
        //System.out.println(dd+ch+mm+ch+yy);  //addition
        //System.out.println(dd+""+ch+mm+""+ch+yy);  //conatenation	
  
        System.out.println("Date: "+dd+ ch +mm+ ch +yy);//first string is there so concat will done
    }
}