class BoxDemo
{
	public static void main(String []args)
	{
		Box b1;
		b1=new Box();
		System.out.println(b1.calVolume());
		
		Box b2;
		b2=new Box(10,20,30);
		System.out.println(b2.calVolume());

		Box b3;
		b3=new Box(15);
		System.out.println(b3.calVolume());

	}
}