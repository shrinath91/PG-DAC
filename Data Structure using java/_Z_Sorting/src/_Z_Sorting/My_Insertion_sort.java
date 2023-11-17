package _Z_Sorting;

public class My_Insertion_sort
{
	public static int[] insertion_sort(int arr[])
	{
		int size = arr.length;
		for(int i=1; i<size-1; i++)
		{
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return arr;
	}
	public static void main(String[] args)
	{
		//		int []arr = new int[10];

		int arr[] = {1,9,2,3,5,6,7,8};//8
		
		arr=insertion_sort(arr);
		
		for(int i=0; i<arr.length; i++)///display
		{
			System.out.print(arr[i]+", ");
		}


	}

}
