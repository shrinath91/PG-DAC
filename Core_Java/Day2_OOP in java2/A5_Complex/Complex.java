 class Complex
{
	private int real;
	private int imag;

	public Complex()
	{
	}	
	public Complex(int real, int imag)
	{
		this.real=real;
		this.imag=imag;
	}
	public Complex(Complex c)
	{
		this.real=c.real;
		this.imag=c.imag;
	}
	
	public void display()
	{
		System.out.println("Real: "+ real+ " Imag: "+imag);
	}
}