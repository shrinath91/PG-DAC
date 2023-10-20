package a;

public class _8_mergeTwoArrays 
{	

	public static void main(String[] args) 
	{
//		int []arr1 = new int[1];
		
		int []arr1 = {1,2,3,4};
		int []arr2 = {11,22,33,44,55};
		int b=0;
		
		int new_length = arr1.length+arr2.length;
		
		int []arr3 = new int[new_length];
		
		for(int i=0; i<arr1.length; i++)
		{		
			arr3[i]=arr1[i];
		}

		for(int i=arr1.length; i<arr3.length; i++)
		{		
//			arr3[i]=arr2[arr1.length-4];
//			
//			arr.length;
			arr3[i]=arr2[b++];
		}
		
		for(int i=0; i<arr3.length; i++)
		{
			System.out.println(arr3[i]);
		}
		
		
	}

}
