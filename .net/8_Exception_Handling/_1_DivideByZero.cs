using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _8_Exception_Handling
{
    internal class DivideByZero
    {
        static int Main1(string[] args)
        {
            int a, b;
            Console.Write("Enter A: ");
            //a = Console.Read();//reads char
            a = int.Parse(Console.ReadLine());
            Console.Write("Enter B: ");
            b = int.Parse(Console.ReadLine()); 
            try
            {
                int ans = a / b;
                Console.Write(ans);
            }
            catch (SystemException s)
            {
                Console.WriteLine("Inside Sys");
                Console.WriteLine(s.Message);
            }
            catch (Exception e)
            {
                Console.WriteLine("Inside Excep");
                Console.WriteLine(e.Message);
            }
            return 0;
        }
    }
}
