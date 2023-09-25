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

        Cstring operator=(Cstring &);
};
