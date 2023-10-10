package _5Colorpoint;

public class Point {
	private int x;
	private int y;
	
	public Point()
	{}
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public void display()
	{
		System.out.print("["+x+","+y+"]");
	}

}
