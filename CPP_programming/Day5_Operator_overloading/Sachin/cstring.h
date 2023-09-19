#include<iostream>
#include<string.h>
using namespace std;

class cstring
{
private:
    int len;
    char *str;
public:
    void Display();
    cstring();
    cstring(const char *);
    cstring(cstring&);
    int operator<(cstring&);
    ~cstring();
    cstring operator=(cstring&);
    cstring operator[](int);
};