package a;

public class _1_print_prime 
{
	public static void main(String[] args) 
	{
		boolean flag;
		for(int num=1; num<=100; num++)
		{
			if(num==1)
			{
				continue;
			}
			flag=true;
			for(int j=2; j<=num/2; j++)
			{
				if(num%j==0)
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
			{
				System.out.print(num+", ");
			}
		}
	}

	

}




//public static void main(String[] args) 
//{
//	boolean flag;
//	
//	System.out.print("Prime num in 1-100:");
//	for(int i=1; i<=100; i++)
//	{
//		if(i==1)
//			System.out.println(i+", ");
//			break;
//			
//		flag = true;
//		
//		for(int j=2; j<i/2; j++)
//		{
//			if(i%j==0)
//				flag=false;
//				break;
//		}
//		if(flag)
//		{
//			System.out.print(i +", ");
//		}
//	
//	}
//}