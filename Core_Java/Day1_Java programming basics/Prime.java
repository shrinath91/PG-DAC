class Prime
{
	public static void main(String args[])
	{
		int i, num=13;
		System.out.println("Num: "+num);
		for(i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				break;
			}	
		}
		if(i>(num/2))
		{System.out.println("Prime");}
		else
		{System.out.println("Not Prime");}
		
	}
}