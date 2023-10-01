//by chahat 

#include<iostream>
#include<string.h>
using namespace std;

class cString
{
    int len;
    char *name;
    public:
        cString();
        cString(const char*);
        cString(cString &);
        bool operator < (cString &);
        bool operator > (cString &);
        bool operator == (cString &);
        cString operator = (cString &);
        char& operator[] (int);
        ~cString();
        void display();
};
cString :: cString()
{
    len=1;
    name = new char[len];
    strcpy(name,"\0");
}
cString :: cString (const char*str)
{
    len = strlen(str);
    this->name = new char[len + 1];
    strcpy(name,str);
}
cString :: cString(cString &obj)
{
    this->len = strlen(obj.name);
    this -> name = new char[(this->len) + 1];
    strcpy(this->name,obj.name);
}
cString :: ~cString()
{
    delete []name;
}
void cString:: display()
{
    cout<<"name = "<<name<<endl;
}
cString cString :: operator = (cString&obj)
{
    this->len = strlen(obj.name);
    this->name = new char[this->len + 1];
    strcpy(this->name , obj.name);
    return *this;
}
char & cString :: operator[] (int pos)
{
    if (pos>=0 && pos <this->len)
    {
        return name [pos];
    }
    else
    {cout<<"sahi daalo bhai";}
}
bool cString :: operator == (cString &obj)
{
    int res = strcmp(this-> name,obj.name);
    if (res == 0)
    {
        return true;
    }
    else
    return false;

}
bool cString :: operator < (cString &obj)
{
    int res = strcmp(this-> name,obj.name);
    if (res== -1)
    {
        return true;
    }
    else
    return false;
}
bool cString :: operator > (cString &obj)
{
    int res = strcmp(this-> name,obj.name);
    if (res == 1)
    {
        return true;
    }
    else
    return false;

}
int main()
{
    cString c1;c1.display();
    cString c2("Seeta");c2.display();
    cString c3;
    c3=c2;
    c3.display();
    cString c4("Nita Ambani");c4.display();
    if(c4==c3)
    {
        cout<<"c4 is c3"<<endl;
    }
    else if(c3>c4)
    {
        cout<<"c3 is bigger"<<endl;
    }
    else if (c3<c4)
    {
        cout<<"c4 is bigger"<<endl;
    }
    else 
    {
        cout<<"sahi se try kro";
    }
    c4[0]='G';

    c4.display();
}
