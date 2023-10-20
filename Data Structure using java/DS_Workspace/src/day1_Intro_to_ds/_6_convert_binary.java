package day1_Intro_to_ds;

import java.util.Scanner;

public class _6_convert_binary 
{
	public static int power(int base, int index)
	{
		int res=1;
		
		for(int i=0; i<index; i++)
		{
			res=res*base;
		}
		return res;
	}

	public static void main(String[] args) {/////////////////////////main
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary number: ");
		int bin = sc.nextInt();
		sc.close();
		
		int x;
		int index=0;
		int dec=0;
		
		while(bin!=0)
		{
			x=bin%10;
			
			dec=dec+(x * power(2, index++));
//			index++;
			
			bin/=10;
			
		}
		
		System.out.println("Decimal: "+dec);
		
		
	}

}
