using System;
class Table2
{
	public static void Main9(string[] args)	
	{
	    Console.Write("Enter Number: ");
	    int num1 = int.Parse(Console.ReadLine());
	    int temp = num1;
	    int num2 = 0;
	    while(temp>0)
	    {
	        num2 = (num2*10) + (temp%10);
	        temp/=10;
	    }
	    if(num1 == num2)
	    {
	        Console.WriteLine("Palindrome!!!");
	    }
	    else
	    {
	        Console.WriteLine("Not Palindrome!!!");
	    }
	}

}