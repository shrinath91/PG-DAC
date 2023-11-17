package a1_accept_two_num;

public  class Division_excp 
{
	
	public static void main(String[] args) {
		int res=0;
		int num1, num2;
		try
		{
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);	
			res = num1/num2;
		}
		catch(Exception e)
		{
//			e.printStackTrace();
			System.out.println("Some Error");
		}
		
		
		
		System.out.println("Result: "+res);
		
	}
	
}

