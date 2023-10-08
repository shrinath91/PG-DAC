import java.util.Scanner;
class ArrDemo
{
	public static void row_Col_Wise(int [][]arr)
	{
		int []arrRow;
		int []arrCol;
		arrCol=new int[3]; 
		arrRow=new int[3];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arrRow[i]= arrRow[i] + arr[i][j];
				arrCol[i]= arrCol[i] + arr[j][i];
			}
			System.out.println("\t####Sum of Row"+ i +": "+arrRow[i]);
			System.out.println("\t####Sum of Col"+ i +": "+arrCol[i]);
		}
		
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int [][]arr= new int[3][3];///////try
		//int [][]arr= {{1,2,3},{1,2,3},{1,2,3}};
		
		for(int i=-0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Enter Array element for"+ "arr["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();
			}		
		}
		
		row_Col_Wise(arr);	
		//int []arrCol=colWise(arr);
		}
}