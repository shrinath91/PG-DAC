
#include <iostream>
#include<cstring>
using namespace std;

class String
{
    int length;
    char *ch;
    public:
        String();
        String(const char *);

        String(String &);
        ~String();

        int operator<(String &);
        // int operator>(String &);
        // int operator==(String &);
        // int operator=(String &);
};
String::String()//////////////////constructor
{
    length=1;
    ch = new char[length];
    ch[0]='\0';
}
String::String(const char* ch)
{
    this->length=strlen(ch);
    ch = new char[this->length+1];
    strcpy(this->ch, ch);
}

String::String (String &obj)///////////////////////copy constructor
{
    this->length=obj.length;
    this->ch=new char[this->length+1];
    strcpy(this->ch, obj.ch);
}
String::~String()
{
    delete []this->ch;
}

int String::operator<(String &obj)
{
    return strcmp(this->ch,obj.ch);
}
int main()
{

    
    return 0;
}
