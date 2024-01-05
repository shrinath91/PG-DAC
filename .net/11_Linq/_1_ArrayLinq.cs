using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11_Linq
{
    internal class ArrayLinq
    {
        static void Main(string[] args)
        {
            int[] arr = new int[] { 60, 80, 50, 90, 10, 30, 70, 40, 20, 100 };

            //1:count number of elements in array
            //using query syntax
            var res = (from a in arr select a).Count();
            Console.WriteLine("Number of Elements in Array Using Query Syntax: " + res);
            //using method syntax
            res = arr.Select(a => a).Count();
            Console.WriteLine("Number of Elements in Array Using Method Syntax: " + res);

            //2:count number of elemets 40 >
            //using query syntax
            var res1 = (from a in arr
                        where a > 40
                        select a);
            
            Console.WriteLine("Uisng Query Syntax: Number greater than 40 : ");
            foreach (var a in res1)
            {
                Console.Write(a + " ");
            }
            //using method syntax
            res1 = arr.Where(x => x > 40).Select(x => x);
            Console.WriteLine("\nUisng Method Syntax: Number greater than 40 : ");
            foreach (var a in res1)
            {
                Console.Write(a + " ");
            }

            //3:Count number of elements between 10 and 60
            //using query syntax
            var res2 = (from a in arr
                        where a >= 10 && a <= 60
                        select a).Count();
            Console.WriteLine("\nNumber of Elements between 10&&60 in Array Using Query Syntax: " + res2);
            //using method syntax
            res2 = arr.Where(x => x >= 10 && x <= 60).Count();
            Console.WriteLine("Number of Elements between 10&&60 in Array Using Method Syntax: " + res2);

            //4:Display Acending
            //using query syntax
            var res3 = (from a in arr
                        orderby a
                        select a);
            Console.WriteLine("Acending Sort using query syntax");
            foreach (var a in res3)
            {
                Console.Write(a + " ");
            }
            //using Method syntax
            res3 = arr.OrderBy(x => x);
            Console.WriteLine("\nAcending Sort using method syntax");
            foreach (var a in res3)
            {
                Console.Write(a + " ");
            }

            //5:Display descending
            //using query syntax
            var res4 = (from a in arr
                        orderby a descending
                        select a);
            Console.WriteLine("\nDescending Sort using query syntax");
            foreach (var a in res4)
            {
                Console.Write(a + " ");
            }
            //using Method syntax
            res4 = arr.OrderByDescending(x => x);
            Console.WriteLine("\nDescending Sort using method syntax");
            foreach (var a in res4)
            {
                Console.Write(a + " ");
            }
        }
    }
}
