#include"Book.h"

int Book::cnt=0;
Book::Book()
{
    cnt++;
    book_id= cnt;
    book_name= new char[3];
    strcpy(book_name,"NA");
}
Book::Book(const char *s, float price)
{
    cnt++;
    book_id = cnt;
    this->book_name=new char[(strlen(s))+1];
    strcpy(book_name,s);
    this->price = price;
}
Book::Book(Book &obj)
{
    cnt++;
    this->book_id = cnt;
    this->book_name = new char[(strlen(obj.book_name))+1];
    strcpy(this->book_name, obj.book_name);
    this->price = obj.price;
}
Book::~Book()
{
    delete[] book_name;
}

void Book::display()
{
    cout<<"Book ID: "<<book_id<<"\n";
    cout<<"Name: "<<book_name<<"\n";
    cout<<"Price: "<<price<<"\n";
}