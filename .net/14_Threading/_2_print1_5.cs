using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _14_Threading
{
    public class Print1_5
    {
        public static void Print(int num)
        {
            for (int i = 0; i <= num; i++)
            {
                Console.WriteLine(i);
                Thread.Sleep(500);
            }
        }
        static void Main2(string[] args)
        {
            Thread t1 = new Thread(()=>Print(15));
            t1.Start();
                
        }
    }
}
