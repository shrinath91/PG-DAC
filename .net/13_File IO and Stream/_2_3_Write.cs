using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _13_File_IO_and_Stream
{
    internal class Write
    {
        static void Main(string[] args)
        {
            string path = @"E:\GitHub\PG-DAC git\.net\test.txt";
             
            string input="";
            do
            {
                Console.WriteLine("Enter data to save: ");
                input += "\n";
                //File.WriteAllText(path, input);
                File.AppendAllText(path, input);
                input = Console.ReadLine();
            } while (!input.Equals("q")) ;

            string[] data = File.ReadAllLines(path);
            int cnt = 0;
            foreach (string line in data) 
            {
                Console.WriteLine(cnt++ +":"+line);
            }

            int CharCnt_Max = 0;
            foreach(string s in data)
            {
                int char_Cnt = 0;
                foreach(char c in s)
                {
                    char_Cnt++;
                }
                if (char_Cnt > CharCnt_Max)
                    CharCnt_Max = char_Cnt;
            }

            Console.WriteLine("Max Char: " + CharCnt_Max);

            string path1 = @"E:\GitHub\PG-DAC git\.net\test2.txt";
            File.Copy(path, path1,true);    //true for overriding   

            string path2 = @"E:\GitHub\PG-DAC git\.net\test3.txt";
            File.Copy(path, path2);
            //File.Delete(path2); delete file


        }
    }
}
