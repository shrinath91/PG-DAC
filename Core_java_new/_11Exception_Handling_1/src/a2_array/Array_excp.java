package a2_array;

import java.util.Scanner;


public class Array_excp{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		
		
		int size = sc.nextInt();
		int []arr = new int[size];
		
		System.out.println("Enter "+size+"elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int key;
		try {
			System.out.println("Enter index element to print: ");
			key = sc.nextInt();	
			System.out.println(arr[key]);
//			throw new ArrayIndexOutOfBoundsException();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		
		 
		sc.close();
		
		
	}

}
