package day2_Array;

public class A5_SparseMatrix 
{
	public static void display(int arr[][])///////////////Display
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");				
			}
			System.out.println();
		}
	}
	public static int nonZero_cnt(int arr[][])
	{
		int cnt=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j]!=0)
					cnt++;
			}
		}
		return cnt;
	}
	
	public static int[][] sparseFun(int arr[][]) //------------------------sparseArr
	{
		int non_zero = nonZero_cnt(arr);
		int rows = non_zero+1;
		int col = 3;
		int sparseArr[][] = new int[rows][col];
		int x=1;
		
		sparseArr[0][0]=arr.length;
		sparseArr[0][1]=arr[1].length;
		sparseArr[0][2]=non_zero;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i][j]!=0)
				{
					sparseArr[x][0] = i;
					sparseArr[x][1] = j;
					sparseArr[x][2] = arr[i][j];
					x++;
				}
		
			}
		}
		return sparseArr;
	}
	
	
	public static void main(String[] args) //--------------------main
	{

		int arr[][] = {
				{0,0,7,0,0,0,0},
				{0,0,0,0,0,0,9},
				{0,0,0,0,0,0,0},
				{0,0,0,0,4,0,0},
				{0,0,3,0,0,0,0},
				{2,0,0,0,0,0,0},
				{0,0,0,0,7,0,0}};
		
	
		System.out.println("Sparse Matrix: ");
		display(sparseFun(arr));
	}
	

}
