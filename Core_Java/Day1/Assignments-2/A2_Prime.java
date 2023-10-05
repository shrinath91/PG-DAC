class A2_Prime
{
	public static void main(String args[])
	{
		int i, num=13;
		System.out.println("Num: "+num);
		if(num==1)
		{
			System.out.println("Nor prime nor composite");
		}
		else if(num==2)
		{
			System.out.println("Prime!!!");
		}
		else if(num>2)
		{
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
}