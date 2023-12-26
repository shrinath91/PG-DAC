using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4_Reference_and_Value_Type
{
    public struct Student
    {
        private int roll=0;
        private string name="NA";
        private string email="NA";
        private int[] marks = new int[3];

        public Student(int roll, string name, string email, int[] marks)
        {
            this.roll = roll;
            this.name = name;
            this.email = email;
            this.marks = marks;
        }

        public void Display()
        {
            Console.WriteLine($"Roll:{roll}");
            Console.WriteLine($"nAME: {name}");
            Console.WriteLine($"Email: {email}");
            Console.WriteLine($"Marks: {marks[0]},{marks[1]},{marks[2]}");
        }
    }

    class Sol1
    {
        public static void Main1(string[] args)
        {
            int[] arr = new int[] { 80, 90, 70 };
            Student s1 = new Student(1, "Shri", "abc@gmail.com",arr);

            s1.Display();
        }
    }








}
