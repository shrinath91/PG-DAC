package day2_Array;
public class A2_add_2D_matrix 
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
	
	
	public static int[][] addMatrix(int arr1[][], int arr2[][])
	{
		int arrRes[][] = new int [2][2];
		
		for(int i=0; i<arrRes.length; i++)
		{
			for(int j=0; j<arrRes.length; j++)
			{
				arrRes[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return arrRes;
	}
	
	
	public static void main(String[] args) 
	{
		int arr1[][] = {{2, 5,},{ 7, 6}};
		int arr2[][] = {{12, 11},{ 9, 7}};
		
		System.err.println("arr1: ");
		display(arr1);
		System.err.println("arr2: ");
		display(arr2);
		
		System.out.println("Addition matrix:");
		display(addMatrix(arr1, arr2));
		

	}

}
