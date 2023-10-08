import java.util.Scanner;
class Arrunique
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int [] arr= new int[5];
		System.out.print("Enter 5 element: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(check(arr));
		
	}	
		 
		public static boolean check(int[] arr)
		{
			for(int i=0; i<arr.length; i++)
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i]==arr[j])
					{
						return false;
					}
				}
			}
			return true;
		}
		
		
	
}
