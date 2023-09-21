#include <iostream>
#include<Cstring>
using namespace std;

class Cstring
{
    int length;
    char *ch;
    public:
        Cstring();
        Cstring(const char *);

        Cstring(Cstring &);
        ~Cstring();

        void display() const;

        int operator<(Cstring &);
        int operator>(Cstring &);
        int operator==(Cstring &);
        Cstring operator=(Cstring &);

        char operator[](int );

};
