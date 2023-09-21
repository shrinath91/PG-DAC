#include"Cstring.h"
#include"Date.h"
class Person
{
    Cstring name;
    Date b_date;
    public:
        Person();
        Person(Cstring, Date);
        Person(const char *, int d, int m, int y);
        Person(Person &);
        void display();
};