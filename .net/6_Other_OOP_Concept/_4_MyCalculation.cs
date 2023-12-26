using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace _6_Other_OOP_Concept
{
    internal sealed class MyCalculation 
    {
        public int Multiply(int a, int b)
        {
            return  a * b;
        }
        public int Power1(int a, int b)
        {
            int temp = a;
            for(int i=1; i<b; i++)
            {
                a *= temp;
            }
            return a;
        }
    }
   /* class MyCalculation2 : MyCalculation
    {                                                     error
    }*/

    class Sol4
    {
        public static void Main4(string[] args)
        {
            MyCalculation m1 = new MyCalculation();
            Console.WriteLine(m1.Multiply(1, 2));
            Console.WriteLine(m1.Power1(2,3));
        }
    }

}
