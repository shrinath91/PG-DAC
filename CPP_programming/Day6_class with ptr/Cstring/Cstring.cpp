#include"Cstring.h"
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

int Cstring::operator<(Cstring &obj)/////////////////operator overloading
{
    return strcmp(this->ch, obj.ch);
}
int Cstring::operator>(Cstring &obj)//
{
    return strcmp(this->ch, obj.ch);
}
int Cstring::operator==(Cstring &obj)//
{
    return strcmp(this->ch, obj.ch);
}
Cstring Cstring::operator=(Cstring &obj)//
{
    if(this == &obj)
        return *this;
    
    delete[] this->ch;

    this->length=obj.length;
    this->ch=new char[this->length+1];
    strcpy(this->ch,obj.ch);
    return *this;
}

char Cstring::operator[](int value)
{
    if(0 < value && value < length)
    {
        return this->ch[value];
    }
    
    return ch[0];
}