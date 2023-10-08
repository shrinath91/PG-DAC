class ComplexDemo
{
	public static void main(String []args)
	{
		Complex c1;
		c1=new Complex();
		c1.display();

		Complex c2;	
		c2=new Complex(2,3);
		c2.display();

		Complex c3;
		c3=new Complex(c2);
		c3.display();

	}

}