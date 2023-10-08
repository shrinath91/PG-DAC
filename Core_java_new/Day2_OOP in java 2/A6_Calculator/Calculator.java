class Calculator
{
private int a;
private int b;

	public Calculator()
	{
	}
	public Calculator(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public Calculator(Calculator c)
	{
		this.a=c.a;
		this.b=c.b;
	}

	public int add()
	{
		return a+b;
	}
	public int sub()
	{
		return a-b;
	}
	public int mul()
	{
		return a*b;
	}
	public int div()
	{
		return a/b;
	}

	public void displayAll()
	{
		System.out.println("Addition:"+ (a+b));
		System.out.println("Substraction:"+ (a-b));
		System.out.println("Multiplication:"+ (a*b));
		System.out.println("Division:"+ (a/b));
	}

}