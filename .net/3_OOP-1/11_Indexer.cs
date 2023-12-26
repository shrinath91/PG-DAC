using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_OOP_1
{
    internal class IndexerExample
    {
        private int[] num = new int[5];

        public int this[int index]
        {
            get {
                if(index >= 0 && num.Length > index)
                    return num[index]; 
                return -1;
            }  
            set {
                if (index >= 0 && num.Length > index)
                    num[index] = value;
                else
                    Console.WriteLine("Cant Add :Array Out of Bound!!!");
            }
        }
    }
    class Sol
    {
        public static void Main(string[] args)
        {
            IndexerExample ind = new IndexerExample();
            ind[0] = 5;
            ind[1] = 10;
            ind[2] = 20;
            ind[3] = 30; 
            ind[4] = 50;
            ind[5] = 100;

            for(int i=0; i<5; i++)
            {
                Console.WriteLine($"i[{i}]: {ind[i]}");
            }

            Console.WriteLine($"ind[5]: {ind[5]}");



        }
    }
}
