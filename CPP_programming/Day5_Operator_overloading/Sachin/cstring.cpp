#include"cstring.h"


int cstring::operator<(cstring &s)
{
    return(strcmp(this->str,s.str));

}

cstring::cstring(/* args */)
{
    len=1;
    str=new char[len];
    str[0]='\0';
}

cstring::cstring(const char *str)
{
    this->len = strlen(str);
    this->str = new char[this->len+1];
    strcpy(this->str,str);
}

cstring::cstring(cstring &c)
{
    this->len=c.len;
    this->str= new char[this->len+1];
    strcpy(this->str,str);
}

cstring cstring::operator=(cstring &s)
{
    this->len=s.len;
    this->str=new char[this->len+1];
    strcpy(this->str,s.str);
    return *this;
}

cstring::~cstring()
{
    delete []str;
}

void cstring::Display()
{
    cout<<str;
}