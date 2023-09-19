
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
};

Cstring::Cstring()//////////////////constructor
{
    length=1;
    ch = new char[length];
    ch[0]='\0';
}
Cstring::Cstring(const char* ch)
{
    this->length=strlen(ch);
    this->ch = new char[this->length+1];
    strcpy(this->ch, ch); 
}

Cstring::Cstring (Cstring &obj)///////////////////////copy constructor
{
    this->length=obj.length;
    this->ch=new char[this->length+1];
    strcpy(this->ch, obj.ch);
}
Cstring::~Cstring()
{
    delete []this->ch;
}

void Cstring::display() const
{
    cout<<this->ch<<"\n";
}

int Cstring::operator<(Cstring &obj)/////////////////overloading
{
    return strcmp(this->ch, obj.ch);
}
int Cstring::operator>(Cstring &obj)
{
    return strcmp(this->ch, obj.ch);
}
int Cstring::operator==(Cstring &obj)
{
    return strcmp(this->ch, obj.ch);
}
Cstring Cstring::operator=(Cstring &obj)
{
    if(this== &obj)
        return *this;
    
    delete[] this->ch;

    this->length=obj.length;
    this->ch=new char[this->length+1];
    strcpy(this->ch,obj.ch);
    return *this;
}

int main()
{
    Cstring c1("Hello");
    Cstring c2("hello");

    int res;
    // res=c1.operator<(c2);
    // int res=c1<c2;
    // cout<<"Res: "<<res<<"\n";
    // if(res==-1)
    //     cout<<"1"<<"\n";
    // else if(res==1)
    //     cout<<"0"<<"\n";

    // res=c1>c2;
    // cout<<"Res: "<<res<<"\n";
    // if(res==1)
    //     cout<<"1"<<"\n";
    // else if(res==-1)
    //     cout<<"0"<<"\n";
    
    // res=c1==c2;
    // cout<<"Res: "<<res<<"\n";
    // if(res==0)
    //     cout<<"1"<<"\n";
    // else if(res!=0)
    //     cout<<"0"<<"\n";

    c1=c2;
    c1.display();
    


    
    return 0;
}
