package day2_Array;

public class A4_arr_transpose 
{
	public static void display(int arr[][])///////////////Display
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j]+" ");				
			}
			System.out.println();
		}
	}


	private static int[][] transpose(int[][] arr) 
	{
		int arrNew[][] = new int[arr.length][arr[0].length];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{ 
				arrNew[i][j] = arr[j][i];
			}
		}
		return arrNew;
	}

	



	public static void main(String[] args) {
		int arr[][] = {{2, 5,},{ 7, 6}};
	
		System.err.println("Array : ");
		display(arr);
	
		System.out.println("Transpose: ");
	
		display(transpose(arr));
	}
}

