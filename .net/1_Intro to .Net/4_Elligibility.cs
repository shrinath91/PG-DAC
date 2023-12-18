using System;
class Elligibility
{
	public static void Main(string[] args)	
	{
		dynamic math, phy, chem;
		Console.WriteLine("Please Enter Math Marks:");
		math = int.Parse(Console.ReadLine());
		Console.WriteLine("Please Enter Physics Marks:");
		phy = int.Parse(Console.ReadLine());
		Console.WriteLine("Please Enter Chemistry Marks:");
		chem = int.Parse(Console.ReadLine());
		
		int sum = math+phy+chem;
	    if(!(math>=65))
	    {
	        Console.WriteLine("Maths marks is less than 65");
	    }
	    else if(!(phy>=55))
	    {
	        Console.WriteLine("Phy marks is less than 55");
	    }
	    else if(!(chem>=50))
	    {
	        Console.WriteLine("Chem marks is less than 50");
	    }
	    else if(!(sum>=180))
	    {
	        Console.WriteLine("Sum marks is less than 180");
	    }
	    else 
            Console.WriteLine("Elligible for Proffessional Course!!!");
		
	}

}