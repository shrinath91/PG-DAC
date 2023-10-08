import java.util.Scanner;
class Arr_min_max
{
	public static void main(String []args)
	{	
		int max=0;
		float avg;
		int sum=0;
		int min;
		int[] arr;
		arr=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 array elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		min=arr[1];
		for(int i=0; i<arr.length; i++)
		{

			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
			
			sum=sum+arr[i];
			
			System.out.println(arr[i]+", ");
		}
		avg=sum/5;
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
		System.out.println("Avg :"+avg);
		
		
	}
}