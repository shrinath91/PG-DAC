import java.util.Scanner;
class BoxDemo
{
	public static void main(String []args)
	{
		Box []arr=new Box[3];
		Scanner sc=new Scanner(System.in);
		int height;
		int width;
		int depth;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter Dimension for Box"+ i);
			height=sc.nextInt();
			width=sc.nextInt();
			depth=sc.nextInt();
			arr[i]=new Box(height, width, depth);
			
			System.out.println(arr[i].calVolume());
		}
		

	}
}