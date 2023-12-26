using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace _8_Exception_Handling
{
    internal class InvalideCountryException : Exception
    {
        public InvalideCountryException() 
        { Console.WriteLine("User outside India cannot be registrered!"); }
    }
    internal class UserRegistration
    {
        public string UserName {get; set; }
        public string UserCountry { get; set; }     
        
        public UserRegistration(string userName, string userCountry) 
        {
            UserName = userName;
            UserCountry = userCountry;
        }
        public void  RegisterUser()
        {
            try { 
                if(!(UserCountry.Equals("india") || UserCountry.Equals("India")))
                {
                    throw new InvalideCountryException();
                }
                else
                {
                    Console.WriteLine(UserName+": Registration Successful!!!");
                }
            }
            catch(InvalideCountryException e)
            {
                Console.WriteLine(e.Message);
            }

        }
    }
    internal class Demo4
    {
        static int Main4(string[] args)
        {
            UserRegistration u1 = new UserRegistration("Shri","India");
            u1.RegisterUser();
            UserRegistration u2 = new UserRegistration("Daulat", "USA");
            u2.RegisterUser();

            return 0;
        }
    }
}
