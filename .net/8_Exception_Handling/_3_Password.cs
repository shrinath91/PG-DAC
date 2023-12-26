using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _8_Exception_Handling
{
    internal class PassTooLong : Exception
    {
        public PassTooLong() 
        { Console.WriteLine("Pass too long!!!"); }
    }
    internal class  PassTooShort : Exception 
    {
        public PassTooShort() 
        { Console.WriteLine("Pass too short!!!"); }
    }

    internal class PassWord
    {
        static int Main3(string[] args)
        {
            string ? pass = null;
            Console.WriteLine("Enter Pass: ");
            try { 
                pass = Console.ReadLine(); 
                if(pass.Length<8)
                {
                    throw new PassTooShort();
                }
                else if(pass.Length>12)
                { 
                    throw new PassTooLong(); 
                }
            } 
            catch(Exception e)
            {
                Console.WriteLine(e.StackTrace);
            }
            finally { 
                Console.WriteLine(pass); 
            }

            return 0;
        }
    }
}
