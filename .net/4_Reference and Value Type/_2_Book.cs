using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4_Reference_and_Value_Type
{
    public struct Book
    {
        private Book[] b1 = new Book[3];
        private int bid;
        private string name;
        private string author;
        private int price;

        public Book(Book[] b1, int bid, string name, string author, int price)
        {
            this.b1 = b1;
            this.bid = bid;
            this.name = name;
            this.author = author;
            this.price = price;
        }


        /*public Book ? this[int index]
        {
            get
            {
                if (0 <= index && index <= b1.Length)
                {
                    return b1[index];
                }
                return null;
            }
            set
            {
                if (0 <= index && index <= b1.Length)
                {
                    
                }

            }
        }*/

        public void Display()
        {
            Console.WriteLine($"Bookid: {bid}");
            Console.WriteLine($"Book: {name}");
            Console.WriteLine($"Author: {author}");
            Console.WriteLine($"Price: {price}");
        }

        public void AcceptBook()
        {
            Console.Write("Enter id:");
            bid = int.Parse(Console.ReadLine());
            Console.Write("Enter NAme:");
            name = Console.ReadLine();
            Console.Write("Enter Author:");
            author = Console.ReadLine();
            Console.Write("Enter Price:");
            price = int.Parse(Console.ReadLine());
        }
        
    }

    class Sol2
    {
        public static void Main2(String[] args)
        {
            Book[] books = new Book[3];
            books[0] = new Book();
            books[1] = new Book();
            books[2] = new Book();

            for(int i=0; i<3; i++)
            {
                books[i].AcceptBook();
            }
            for (int i = 0; i < 3; i++)
            {
                books[i].Display();
            }

        }
        
       
    }

}
