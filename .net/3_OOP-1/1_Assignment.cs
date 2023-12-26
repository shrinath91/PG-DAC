using System;

public class Example
{
    private int a, b, c;
    public Example()
    {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    public Example(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int Multiply(int a, int b, int c=1)
    {
        return (a * b * c);
    }

    public int Multiply2(params int[] args)
    {
        int ans=1;
        foreach(int v in args)
        {
            ans *= v;
        }
        return ans;
    }
}

class Sol1 
{
	public static void Main1()
	{
		Example example = new Example();
		int ans1 = example.Multiply(2,3);//optional
		Console.WriteLine($"Answer: {ans1}");

        int ans2 = example.Multiply(a:1,b:2);//named
        Console.WriteLine($"Answer: {ans2}");

        int ans3 = example.Multiply(4, 5, 6);//positional
        Console.WriteLine("Answer: "+ans3);

        int ans4 = example.Multiply2(1, 2, 3, 4, 5);//params
        Console.WriteLine($"Answer: " + ans4);
	}
}

