package day2_Array;

import java.util.Scanner;

public class A1 
{

	public static void display(int arr[])///////////////Display
	{
		int x=1;
		//		System.out.print("arr"+ x +"[]: ");/////////////////////////////////////////////////////doubt

		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		x++;
	}
	public static int countCommon(int arr1[], int arr2[])
	{
		int cnt=0;
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					cnt++;
				}
			}
		}

		return cnt;

	}
	public static int[] union(int arr1[], int arr2[])
	{
		System.out.println("Union of arr1 and arr2: ");

		int size = arr1.length + arr2.length;
		int size_arr3 = size - countCommon(arr1, arr2);

		int arr3[] = new int[size_arr3];
		int x=0;
		for(int i=0; i<arr1.length; i++)
		{

			arr3[x]=arr1[i];
			x++;
		}

		size= arr3.length-countCommon(arr1, arr2);
		boolean flag=true;
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr1.length; j++)
			{
				if(arr1[j]==arr2[i])
				{
					flag=false;
				}
			}
			if(flag)
				arr3[x++]=arr2[i];
		}
		return arr3;
	}

	public static int[] intersection(int arr1[], int arr2[])
	{
		System.out.println("Intersection of arr1 and arr2: ");

		int size=countCommon(arr1, arr2);
		int arr3[] = new int[size];
		int x=0;
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					arr3[x++]=arr1[i];
				}
			}
		}


		return arr3;
	}
	public static int countEven(int []arr1, int arr2[])
	{
		System.out.println("Count all even numbers from both array: ");

		int cnt=0;
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]%2==0)
				cnt++;
		}

		for(int j=0; j<arr2.length; j++)
		{
			if(arr2[j]%2==0)
				cnt++;
		}


		return cnt;
	}
	public static int countOdd(int []arr1, int arr2[])
	{
		System.out.println("Count all Odd numbers from both array: ");

		int cnt=0;

		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]%2!=0)
				cnt++;
		}

		for(int j=0; j<arr2.length; j++)
		{
			if(arr2[j]%2!=0)
				cnt++;
		}
		return cnt;
	}


	public static void main(String[] args) {////////////////main

		Scanner sc =  new Scanner(System.in);
		int arr1[] = {2, 5, 7, 6};
		int arr2[] = {12, 11, 9, 7, 5, 2};
		int ch;
		int x=1;

		do {
			System.out.println("1.Display Arrays");
			System.out.println("2.Union of two arrays");
			System.out.println("3.Intersection of two arrays");
			System.out.println("4.Count all even numbers from both array");
			System.out.println("5.count all odd numbers from both array");
			ch = sc.nextInt();

			switch(ch)
			{
			case 1:		
				System.out.print("arr"+ x +"[]: ");
				display(arr1);
				System.out.print("arr"+ x +"[]: ");
				display(arr2);
				break;

			case 2:
				display(union(arr1, arr2));
				break;

			case 3:
				display(intersection(arr1, arr2));
				break;

			case 4:
				System.out.println(countEven(arr1, arr2));
				break;

			case 5:
				System.err.println(countOdd(arr1, arr2));
				break;
			default:
				System.out.println("Thank you Paji!!!!!!!");
			}

		}while(ch!=0);

		display(arr1);
		display(arr2);
	}

}
