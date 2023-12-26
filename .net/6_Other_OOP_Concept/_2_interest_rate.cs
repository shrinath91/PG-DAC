using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _6_Other_OOP_Concept
{
    internal class Account2 : Account
    {
        static float int_rate;
        static Account2()
        {
            int_rate = 8.5f;
        }
        public Account2():base()
        { }
        public Account2(int bal) : base(bal)
        { }
        internal static void ChangeRate(float rate)
        {
            int_rate = rate;
        }
        public void Display()
        {
            Console.WriteLine($"Acc: {base.Acc}");
            Console.WriteLine($"Bal: {base.Balance+base.Balance*int_rate/100}");
            Console.WriteLine($"Rate: {int_rate}");
        }


    }
    class Sol2
    {
       public static void Main2(String[] args)
       {
            Account2 a1 = new Account2();
            a1.Display();

            Account2 a2 = new Account2(5000);
            a2.Display();
            Account2.ChangeRate(5.5f);
            a2.Display();
            

       }
    }

}
