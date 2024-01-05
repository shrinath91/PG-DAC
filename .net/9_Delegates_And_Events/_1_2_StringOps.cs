using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Net.Mime.MediaTypeNames;
/*
1.Write Delegate which will have return type as void and will take input String Parameter.Write Following Method and Invoke them using
Single cast delegate, Multicast Delegate, Func and Action
1. public void Upper(string s) //Print s in upper case
2. public void Lower(string s) //Print s in lower case
3. public void Print(string s) //Print s

*/

namespace _9_Delegates_And_Events
{
    public delegate void MyDel(String s);
    internal class StringOps
    {
        public  void Upper(string s)
        {
            Console.WriteLine(s.ToUpper());
        }
        public  void Lower(string s)
        {
            Console.WriteLine(s.ToLower()); 
        }
        public string Upper1(string s)
        {
            return(s.ToUpper());
        }
        
        public void  Print(String s)
        {
            Console.WriteLine(s);
        }

        static void Main1(string[] args)
        {
            Console.WriteLine("Assignment 1_______________________________________");

            StringOps s1 = new StringOps();
            //MyDel m1 = new MyDel(s1.Upper); id method is not static
            MyDel m1 = s1.Upper;
            m1.Invoke("Shrinath");

            Console.WriteLine("_______________________________________");
            m1 += s1.Lower;
            m1("Daulat");

            Console.WriteLine("Func_______________________________________");
            StringOps s2 = new StringOps();
            Func<String, String> fun1 = s1.Upper1;
            Console.WriteLine(fun1("Hello"));

            Console.WriteLine("Action_______________________________________");
            StringOps s3 = new StringOps();
            Action<String> act1 = s3.Print;
            act1("Hello Shri");


            Console.WriteLine("\nAssignment 2_______________________________________");
            StringOps s4 = new StringOps();
            Func<string, string> fun2 = delegate (string s)//annonymous
            {
                return s.ToUpper();
            };

            Console.WriteLine(fun2("Rattan"));

            Action<string> act2 = (string s) => { Console.WriteLine(s); };
            act2("Hello World");












        }
    }
}
