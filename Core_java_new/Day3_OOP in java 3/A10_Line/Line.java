class Line
{
	private int start_point;
	private int end_point;
	
	public Line()
	{
	}
	public Line(int st_pt, int ed_pt)
	{
		start_point=st_pt;
		end_point=ed_pt;
	}
	
	public int getStart_point()////////////getter setter
	{
		return start_point;
	}
	public int getEnd_point()
	{
		return end_point;
	}
	
	public void setStart_point(int st_pt)
	{
		start_point=st_pt;
	}
	public void setEnd_point(int ed_pt)
	{
		end_point=ed_pt;
	}
	
	public void displayLine()//////////////////methods
	{
		System.out.println("Start: "+start_point);
		System.out.println("End: "+end_point);
	}
	
}
