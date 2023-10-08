class CalculatorDemo
{
	public static void main(String []args)
	{
		Calculator c1;
		c1=new Calculator();
		//c1.displayAll(); //exception divide by 0

		Calculator c2;
		c2=new Calculator(10,5);
		System.out.println(c2.add());
		System.out.println(c2.sub());
		System.out.println(c2.mul());
		System.out.println(c2.div());

		Calculator c3;
		c3=new Calculator(c2);
		c3.displayAll();

		

	}

}	