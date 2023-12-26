using System;
class StudentDetails
{
	public static void Main5(string[] args)	
	{
	    int roll;
	    Console.WriteLine("Enter Roll no: ");
	    roll = int.Parse(Console.ReadLine());
	    
	    string name;
	    Console.WriteLine("Enter Name: ");
	    name = Console.ReadLine();
	    
		dynamic math, c_app, chem;
		Console.WriteLine("Please Enter Math Marks:");
		math = int.Parse(Console.ReadLine());
		
		Console.WriteLine("Please Enter Computer Application Marks:");
		c_app = int.Parse(Console.ReadLine());
		
		Console.WriteLine("Please Enter Chemistry Marks:");
		chem = int.Parse(Console.ReadLine());
		
		int sum = math+c_app+chem;
		float percent = (sum*100)/300;
		string cls = "";
		if(percent>=80)
		{
		    cls = "First";
		}
		else if(percent>=70)
		{
		    cls = "Second";
		}
		else if(percent>=60)
		{
		    cls = "Third";
		}
		else if(percent>=50)
		{
		    cls = "Pass";
		}
		
	    Console.WriteLine("Roll No: "+roll);
	    Console.WriteLine("Name: "+name);
	    Console.WriteLine("Marks in Comp Application: "+c_app);
	    Console.WriteLine("Marks in Computer Application: "+c_app);
	    Console.WriteLine("Marks in Chemistry: "+chem);
	    Console.WriteLine("Total Marks : "+sum);
	    Console.WriteLine("Percentage : "+percent);
	    Console.WriteLine("Class : "+cls+" class");
	    
	}

}