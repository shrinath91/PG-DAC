#include<iostream>
#include<Cstring>
using namespace std;
class Book
{
    int book_id;
    char *book_name;
     float price; 
    static int cnt;   
    public:
        Book();
        Book(const char *, float);
        Book(Book &);
        ~Book();

        void display();

};
