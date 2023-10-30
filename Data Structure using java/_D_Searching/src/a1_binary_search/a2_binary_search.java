package a1_binary_search;

import java.util.Scanner;

public class a2_binary_search 
{

	public static int bin_search(int arr[],int key) 
	{
		int ub = arr.length-1;
		int lb = 0;
		int mid;
		int comp=0;
		while(lb<ub)
		{
			mid=(lb+ub)/2;/////////
			
			if(arr[mid]==key)
			{
//				return mid;
				return comp;
			}
			else if(arr[mid]>key)
			{
				comp++;
				ub = mid-1;
			}
			else if(mid<key)
			{
				comp++;
				lb = mid+1;
			}
		}
		return comp;
		
	}
	public static void main(String[] args) {
		
//		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			arr[i] = sc.nextInt();
		}		
		System.out.println("Enter Element to Search: ");
		int key = sc.nextInt();
		
		int index = bin_search(arr, key);
		System.out.println("Key Found after Comparison "+index);
		
		
		
		sc.close();
	}

}
