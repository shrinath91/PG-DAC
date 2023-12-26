using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_OOP_1
{
    internal class _4_Point
    {
       public int X { get; set; }
       public int Y { get; set; }

        public void ShowData()
        {
            Console.WriteLine($"[{X},{Y}]");
        }
    }

    class Sol4
    {
        public static void Main4()
        {
            _4_Point p1 = new _4_Point();
            p1.ShowData();

            _4_Point p2  = new _4_Point() { X=10, Y=10};
            p2.ShowData();

            _4_Point p3 = new _4_Point{ X = 20, Y = 20 };//() is optional
            p3.ShowData();
        }
    }

}
