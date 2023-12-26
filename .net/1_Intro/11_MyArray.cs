using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1_Intro
{
    internal class _11_MyArray
    {
        public static void PrintArray(int[] arr)
        {
            Console.Write("Array: \n");
            for (int i = 0; i < arr.Length; i++) 
            {
                Console.WriteLine(arr[i]);
            }
        }
        public static void SumArray(int[] arr) 
        {
            int sum = 0;
            for (int i = 0; i<arr.Length; i++)
            {
                sum = sum + arr[i];
            }
            Console.WriteLine(sum);
        }
        public static void MinMaxArray(int[] arr) 
        {
            int min = int.MaxValue;
            int max = int.MinValue;
            for(int i = 0; i < arr.Length; i++)
            {
                if (min > arr[i])
                {
                    min = arr[i];
                }
                if (max < arr[i])
                {
                    max = arr[i];
                }
            }
            Console.Write("Min: "+min);
            Console.Write("\nMax: " + max);
        }
        public static void IsPerfectArr(int[] arr)
        {
            for (int i = 0; i<arr.Length; i++)
            {
                Console.WriteLine(arr[i]+" : " + CheckPerfect(arr[i]));
            }
        }
        public static bool CheckPerfect(int n)
        {
            int sum = 1;
            for(int i = 2; i<n; i++)
            {
                if(n%i==0)
                {
                    sum += i;
                }
            }
            if(sum==n)
                return true;
            
            return false;
        }
        public static void IsPrimeArr(int[] arr)
        {
            for(int i = 0; i <arr.Length; i++)
            {
                Console.WriteLine(arr[i]+" : " + IsPrime(arr[i]));
            }
        }
        public static string IsPrime(int n) 
        {
            string str = "";
            bool flag = true;
            for(int i=2; i<=n/2; i++)
            {
                if(n%i==0)
                {
                    flag = false;
                    break;
                }
            }
            if (flag)
            {
                str = "Prime";
            }
            else
            {
                str = "Not Prime";
            }

            return str;
        }
        public static void FindFreqArr(int[] arr)
        {
            for(int i=0; i<arr.Length; i++)
            {
                Console.WriteLine(arr[i]+" : "+FindFreq(arr, arr[i]));
            }
        }
        public static int FindFreq(int[] arr, int n)
        {
            int freq = 0;
            for(int j=0; j<arr.Length; j++)
            {
                if (n == arr[j])
                {
                    freq++;
                }
            }
            return freq;
        }
        
        public static void SecondSmallest(int[] arr)
        {
            int min1 = int.MaxValue;
            int min2 = int.MaxValue;

            for(int i=0; i<arr.Length;i++) 
            {
                if (min1 > arr[i])
                {
                    min2 = min1;
                    min1 = arr[i];
                }
                else if (min2 > arr[i] && min1 != arr[i])
                    min2 = arr[i];
            }
            Console.Write("Second Min: " + min2);

        }
        public static void SecondLargest(int[] arr)
        {
            int max1 = int.MinValue;
            int max2 = int.MinValue;
            for(int i=0; i<arr.Length; i++)
            {
                if(max1 < arr[i])
                {
                    max2 = max1;
                    max1 = arr[i];
                }
                else if(max2 < arr[i] && max1 != arr[i])
                {
                    max2 = arr[i];
                }
            }
            Console.Write("Second Max: " + max2);
        }

        public static void Main(String[] args)
        {
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) 
            {
                arr[i] = int.Parse(args[i]);
            }

            int num;
            do
            {
                Console.Write("\nPlease Enter Choice: ");
                num = int.Parse(Console.ReadLine());
                switch(num) 
                {
                    case 1:
                        PrintArray(arr);
                        break;
                    case 2:
                        SumArray(arr);
                        break; 
                    case 3:
                        MinMaxArray(arr);
                        break;
                    case 4:
                        IsPerfectArr(arr);
                        break;
                    case 5:
                        IsPrimeArr(arr);
                        break;
                    case 6:
                        FindFreqArr(arr);
                        break;
                    case 7:
                        SecondSmallest(arr);    
                        break;
                    case 8:
                        SecondLargest(arr);
                        break;
                }
            } while (num!=0);

    

            
        }
    }
}
