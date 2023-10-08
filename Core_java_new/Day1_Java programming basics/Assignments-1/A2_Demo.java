class A2_Demo
{
	 static void main(String args[])
	{
		System.out.println("Demo");
	}
}
//++++after removing public from main method++++
//Error: Main method not found in class Demo, please define the main method as:
//   public static void main(String[] args)

//++++After moving .class file to new directory++++
// Error: Could not find or load main class A2_Demo
// Caused by: java.lang.ClassNotFoundException: A2_Demo

