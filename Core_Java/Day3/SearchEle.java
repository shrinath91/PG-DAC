import java.util.Scanner;
class SearchEle
{
	public static void main(String[] args)/////////////main
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
		 
		public static int check(int[] arr)
		{
			int temp;
			int index;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter element ton search: ");
			temp=sc.nextInt();
			
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i]==temp)
				{
					index = i;
					return index;
				}
				
			}
			return -1;
		}
		
		
	
}
