package assignments;

public class top_element
{
	public static int findTopSecond(int arr[])
	{
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>first)
			{
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second && arr[i]!=first)
			{
				second = arr[i];
			}

		}
		return second;
	}
	public static void main(String[] args)
	{
		int arr[]= {12,32,56,34,35,88,87,53,54,25,69,99};//88

		System.out.println("Second Top Element:"+findTopSecond(arr));

	}

}
//second top element in array without sorting