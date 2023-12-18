using System;
class PrintHello
{
	public static void Main(string[] args)
	{
	    Console.WriteLine("Enter Name: ");
		var name = Console.ReadLine();
		Console.WriteLine("Hello "+name);
	}
}