using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Metadata.Ecma335;
using System.Runtime.Intrinsics.Arm;
using System.Text;
using System.Threading.Tasks;

namespace _8_Exception_Handling
{
    internal class NameNotValidException : Exception
    {
        string msg;
        public NameNotValidException() 
        { 
            msg = "Name is not valid!!!";
        }
        public string ToString()
        {
            return msg;
        }

    }
    internal class NameValid
    {
        public String Fname { get; set; }
        public string Lname { get; set; }
        public void AcceptName()
        {
            Console.Write("Please enter first name: ");
            Fname = Console.ReadLine();
            Console.Write("Please enter last name: ");
            Lname = Console.ReadLine();
        }
        public void ValidateName()
        {
            try
            {
                if (!(char.IsUpper(Fname[0]) && char.IsUpper(Lname[0])))
                {
                    throw new NameNotValidException();
                }
                for (int i = 1; i < Fname.Length; i++)
                {
                    if (!char.IsLower(Fname[i]) )
                    {
                        throw new NameNotValidException();
                    }
                }
                for (int i = 1; i < Lname.Length; i++)
                {
                    if (!char.IsLower(Lname[i]))
                    {
                        throw new NameNotValidException();
                    }
                }
                Console.WriteLine(Fname+" "+Lname+": Valid");
            }
            catch(NameNotValidException e)
            {
                Console.WriteLine(e.ToString());   
            }
        }

    }
    internal class Demo5
    {
        static int Main(string[] args)
        {
            NameValid n1 = new NameValid();
            n1.AcceptName();
            n1.ValidateName();
            return 0;
        }
    }

}
