#include"Book.h"

int main()
{
    Book b1;
    b1.display();
    
    Book b2("ABC", 200.1f);
    b2.display();

    Book b3=b2;
    b3.display();
    
}