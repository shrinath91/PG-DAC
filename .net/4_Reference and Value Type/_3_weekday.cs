using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4_Reference_and_Value_Type
{
    internal class _3_weekday
    {
        enum months
        {
            JAN,
            FEB,
            MAR,
            APR,
            MAY,
            JUN,
            JUL,
            AUG,
            SEP,
            OCT,
            NOV,
            DEC
        }
        enum weekdays
        { SUN, MON=0, TUE, WED, THUR, FRI, SAT }
        public static void Main(string[] args)
        {
            Console.WriteLine((int)weekdays.SUN);
            Console.WriteLine((int)weekdays.MON);
            Console.WriteLine(weekdays.THUR);
            Console.WriteLine((int)weekdays.THUR);//3
            Console.WriteLine((int)weekdays.SUN);//0

        }




    }
}
