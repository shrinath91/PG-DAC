using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _6_Other_OOP_Concept
{
    internal class Account
    {
        private static int temp;
        private int acc;
        private int balance;

        static Account()
        {
            temp = 10;
        }

        public Account()
        {
            acc = temp++;
            Balance = 0;
        }
        public Account(int balance)
        {
            acc = temp++;
            Balance = balance;
        }

        public int Acc { get { return acc; } } 
        public int Balance { get { return balance; } set { balance = value; } }

        public void Display()
        {
            Console.WriteLine($"Acc: {acc}");
            Console.WriteLine($"Bal: {balance}");
        }

    }
    public class Sol1
    {
        public static void Main1(string[] args)
        {
            Account a1 = new Account();
            a1.Display();
            Account a2 = new Account(5000);
            a2.Display();
            Account a3 = new Account(8000);
            a3.Display();


        }
    }

}
