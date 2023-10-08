class PointDemo
{
	public static void main(String []args)
	{
		Point p1;
		p1=new Point();
		p1.display();

		Point p2;
		p2=new Point(1,2);
		p2.display();
		
		Point p3;
		p3=new Point(p2);
		p3.display();
	}

}
