package a;

public class _4_armstrong 
{
	public static int countDigit(int num)
	{
		int digits=0;
		while(num!=0)
		{
			digits++;
			num/=10;
		}
		
		
		return digits;
	}
	public static int power(int base, int index)
	{
		int res=1;
		
		for(int i=0; i<index; i++)
		{
			res=res*base;
		}
//		System.out.println(base+"^"+index+": "+res);
		return res;
	}

	public static void main(String[] args) /////////////////////main
	{
		
		System.out.println("Armstrong bet 1-1000: ");

		for(int num=1; num<=10000; num++)
		{
			int digits = countDigit(num);
			int sum=0;
			int a;
			int temp_num=num;
//			boolean flag=false;
			
			while(temp_num!=0)
			{
				a=temp_num%10;
				temp_num/=10;
				
				sum = sum+power(a,digits);
			}			
	
			if(num==sum) {
				System.out.println(num);
//				flag=true;
//			}		
//			if(flag && num<9999)
//			{
//				
//				System.out.print(",");
			}				
			
		}
		
		
	}

}
