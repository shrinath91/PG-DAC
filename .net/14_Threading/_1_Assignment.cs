using System.Runtime.CompilerServices;

namespace _14_Threading
{
    internal class Assignment
    {
        public static void Print()
        {
            Console.WriteLine("Hello");
        }
        static void Main1(string[] args)
        {
            Thread t1 = new Thread(Print);
            t1.Start();
            t1.Name = "MyThread1";

            Console.WriteLine("Name: "+t1.Name);
            Console.WriteLine("Priority: "+t1.Priority);
        }
    }
}
