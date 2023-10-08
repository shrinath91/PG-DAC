class LineDemo
{
	public static void main(String []args)
	{
		Line l1;
		l1=new Line();
		l1.displayLine();
		
		//Line l2;
		Line l2=new Line(1,4);
		l2.displayLine();
		
		System.out.println("l2 start point: "+l2.getStart_point());
		System.out.println("l2 end point: "+l2.getEnd_point());
		
		l2.setStart_point(8);
		l2.setEnd_point(16);
		
		System.out.println("l2 final start point: "+l2.getStart_point());
		System.out.println("l2 final end point: "+l2.getEnd_point());
	}
}