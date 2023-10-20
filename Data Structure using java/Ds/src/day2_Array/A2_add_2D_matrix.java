import java.util.Scanner;

public class A2_add_2D_matrix 
{
	public static void display(int arr[][])///////////////Display
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				System.out.print(arr[i][j]+" ");				
			}
			System.out.println();
		}
	}
	
	
	public static int[][] addMatrix(int arr1[][], int arr2[][])
	{
		int arrRes[][] = new int [2][2];
		
		for(int i=0; i<arr3.length; i++)
		{
			for(int j=0; j<arr3.length; j++)
			{
				arrRes[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return arrRes;
	}
	
	
	public static void main(String[] args) 
	{
//		int arr1[][] = {{2, 5,},{ 7, 6}};
//		int arr2[][] = {{12, 11},{ 9, 7}};
		System.out.println("Addition matrix:");
//		display(add(arr1, arr2));
		

	}

}
