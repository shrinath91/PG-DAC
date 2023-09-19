#include<iostream>
#include<string.h>
using namespace std;

class String
{
    int len;
    char *str;
    public:
        String();
        String(const char*);
        String(String&);
        void Display() const;
        ~String();
        char operator[](int);
        
};

String::String()
{
    len=1;
    str=new char[len];
    str[0]='\0';
}
String::String(const char *str)
{
    this->len= strlen(str);
    this->str=new char[this->len+1];
    strcpy(this->str,str);
}
void String::Display() const
{
    cout<<endl<<str;
}
String::~String()
{
    delete []str;
}
String::String(String &s)
{
    this->len=s.len;
    this->str=new char[this->len];
    strcpy(this->str, str);
}
char String::operator[](int pos)
{
    return this->str[pos];
}

int main()
{
    String s1, s3, s2("manasi");
    s3=s2;
    s1.Display();
    s2.Display();
    s3.Display();
    char ch=s2[2];
    cout<<"\n\n char :"<<ch;
    
    return 0;
}