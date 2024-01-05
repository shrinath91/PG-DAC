using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Net.Mime.MediaTypeNames;
/*3.Write Delegate which will have return type as int and will take two input Parameter(int, int).Write Following Method and Invoke them
using Single cast delegate, Multicast Delegate, Func
1. public int Add(int a, int b) // return addition of a and b
2. public int Sub(int a, int b) //return Suntraction of a and b
3. public int Multiply(int a, int b) //return Multiplication of a and b
*/
namespace _9_Delegates_And_Events
{
    public delegate void MyDe(int a, int b);
    internal class Del_On_Integer
    {
        public void Add(int a, int b)
        {
            Console.WriteLine(a+b);
        }
        public int Add1(int a, int b)
        {
            return a + b;
        }
        public void Sub(int a, int b)
        {
            Console.WriteLine(b-a);
        }
        public void Multiply(int a, int b)
        {
            Console.WriteLine(a * b);
        }

        static void Main(string[] args)
        {
            Del_On_Integer obj1 = new Del_On_Integer();
            MyDe d1 = obj1.Add;
            d1 += obj1.Sub;
            d1 += obj1.Multiply;
            d1(4,8);

            Del_On_Integer obj2 = new Del_On_Integer();
            Func<int, int, int> fun1 = obj2.Add1;
            Console.WriteLine(fun1(5,8));

            Func<int, int, int> fun2 = (int a, int b) => {  return a + b; };//lambda
        }

    }
}
