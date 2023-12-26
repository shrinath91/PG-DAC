using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Intrinsics.X86;
using System.Text;
using System.Threading.Tasks;

namespace _3_OOP_1
{
    internal class _3_Box
    {
        public int le { get; set; } = 1;
        private int br { get; set; } = 1;
        private int he { get; set; } = 1;

        public _3_Box()
        {
            this.le = 2;
            this.br = 2;
            this.he = 2;
        }

        public _3_Box(int le, int br, int he)
        {
            this.le = le;
            this.br = br;
            this.he = he;
        }
        public _3_Box(_3_Box obj)
        {
            this.le = obj.le;
            this.br = obj.br;
            this.he = obj.he;
        }
        public int GetVolume()
        {
            return this.le*this.br*this.he;
        }
        public void ShowData()
        {
            Console.WriteLine($"Lenght: {le}___Breadth: {br}___Height: {he}");
        }

    }

    class Sol3
    {
        public static void Main3(string[] args) 
        {
            _3_Box b1 = new _3_Box();
            int vol1 = b1.GetVolume();
            Console.WriteLine("Volume: "+vol1);

            _3_Box  b2 = new _3_Box(3,3,3);
            int vol2 = b2.GetVolume();
            Console.WriteLine("Volume: " + vol2);

            _3_Box b3 = b2;
            int vol3 = b3.GetVolume();
            Console.WriteLine("Volume: " + vol3);

            _3_Box b4 = b3;//shallow copy
            int vol4 = b3.GetVolume();
            Console.WriteLine("Volume: " + vol4);
            b4.ShowData();

            _3_Box b5 = new _3_Box(b1);//deep copy
            int vol5 = b3.GetVolume();
            Console.WriteLine("Volume: " + vol5);
            b5.ShowData();
            
        }
        
    }
}
