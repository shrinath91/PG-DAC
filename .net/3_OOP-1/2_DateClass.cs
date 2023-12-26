using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_OOP_1
{
    internal class _2_DateClass
    {
        public int Dd { get; set; }
        public int Mm { get; set; } = 1;
        public int Yy { get; set; } = 1111;
        public _2_DateClass()
        {
            this.Dd = 10;
            this.Mm = 10;
            this.Yy = 1975;
        }
        public _2_DateClass(int dd, int mm, int yy)
        {
            this.Dd = dd;
            this.Mm = mm;
            this.Yy = yy;
        }
        public _2_DateClass(int dd, int yy)
        {
            this.Dd = dd;
            this.Yy = yy;
        }
        public void ShowDate()
        {
            Console.WriteLine($"Date: {Dd}/{Mm}/{Yy}");
        }

    }

    class Sol2
    {
        public static void Main2()
        { 
            _2_DateClass d1 = new _2_DateClass();
            d1.ShowDate();

            _2_DateClass d2 = new _2_DateClass(2,2,1990);
            d2.ShowDate();

            _2_DateClass d3 = new _2_DateClass(3, 1990);
            d3.ShowDate();

        }

    }

}
