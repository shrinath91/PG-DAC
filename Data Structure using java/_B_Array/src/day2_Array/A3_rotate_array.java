package day2_Array;

public class A3_rotate_array {
	public static void rotate_left_arr(int arr[], int rt)
	{
		int temp[] = new int[arr.length];

		int size = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			temp[i]=arr[(i+rt)%size];
		}
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=temp[i];
		}
	}

	public static void rotate_right_arr(int arr[], int rt)
	{
		int temp[] = new int[arr.length];

		int size = arr.length;
		rt = size-rt;
		for(int i=0; i<arr.length; i++)
		{
			temp[i]=arr[(i+rt)%size];
		}
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=temp[i];
		}

	}

	public static void display_Rt_Left(int arr[], int rt)
	{
		int size = arr.length;
		System.out.print("Display left: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[(i+rt)%size]+" ");
		}
		System.out.println();
	}

	public static void display_Rt_Right(int arr[], int rt)
	{
		int size = arr.length;//7
		rt = size-rt;
		System.out.print("Display right: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[(i+rt)%size]+" ");
		}
		System.out.println();
	}

	public static void display(int arr[])
	{	
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50,60,70};

		display_Rt_Left(arr,2);
		display_Rt_Right(arr,4);

		int arr1[]= {10,20,30,40,50,60,70};
		System.out.print("\nArr1 Rotated \"left\": ");
		rotate_left_arr(arr1, 2);
		display(arr1);

		int arr2[]= {10,20,30,40,50,60,70};
		System.out.print("\nArr2 Rotated \"right\": ");
		rotate_right_arr(arr2, 4);
		display(arr2);

	}
}
