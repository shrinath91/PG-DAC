using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _6_Other_OOP_Concept
{
    internal class MyClass1
    {
        /*private int a;
        private int b;*/
        public virtual int Add(int a, int b)
        {
            Console.WriteLine("In Myclass1");
            return a + b;
        }
        public virtual int Sub(int a, int b)
        {
            Console.WriteLine("In Myclass1");
            return b - a;
        }
    }
    class MyClass2 : MyClass1
    { 
        public sealed override int Add(int a, int b)
        {
            Console.WriteLine("In Myclass2");
            return a + b; 
        }
        public override int Sub(int a, int b)
        {
            Console.WriteLine("In Myclass2");
            return b-a;
        }
    }
    class MyClass3 : MyClass2
    {
        //cant overload add
        public override int Sub(int a, int b)
        {
            Console.WriteLine("In Myclass3");
            return base.Sub(a, b);
        }
    }


    class Sol5
    { 
        static void Main5(string[] args)
        {
            MyClass1 m1 = new MyClass1();
            Console.WriteLine(m1.Add(2,2));

            MyClass2 m2 = new MyClass2();
            Console.WriteLine(m2.Add(2, 2));

            MyClass1 m3 = new MyClass2();
            Console.WriteLine(m3.Add(2, 4));

            MyClass3 m4 = new MyClass3();
            Console.WriteLine(m3.Sub(2, 3));
        }
    }


}
