// by tushar

#include<iostream>
#include<string.h>
using namespace std ;
class cString {
    int len ; 
    char *str ; 
    public :
    cString();
    cString(const char *str);
    cString(int  , const char*);
    cString(cString &);
    cString operator=(cString &);
    cString operator+(cString &s2);
    void display()const ;
    char& operator[](int pos);
    friend ostream& operator<<(ostream&, const cString&);
    friend istream& operator>>(istream&, cString&);
    ~cString();

};
cString::cString(){
    len = 1 ;
    str = new char[len];
    str[0] = '\0';
}

cString:: cString(const char *str){
    this -> len = strlen(str);
    this -> str = new char[this->len+1];
    strcpy(this ->str , str);

}
cString::cString(cString &ob){
    this ->len = ob.len;
    this ->str = new char[this ->len+1];
    strcpy(this -> str , ob.str);
}
cString:: ~cString(){
    delete []str ;
}
cString cString :: operator=(cString &s2)
{
    this ->len = s2.len;
    this ->str = new char[this->len+1];
    strcpy(this -> str ,s2.str );
    return *this ;
}
cString cString:: operator+(cString &s2)
{
    cString temp ;
    temp.len = temp.len + s2.len ;
    temp.str = new char[temp.len +1 ];
    strcpy(temp.str ,this ->str );
    strcat(temp.str , s2.str);
    return temp;
}
char& cString :: operator[](int pos)
{
    if(pos>=0 && pos<this ->len){
        return str[pos];
    }
}

ostream& operator<<(ostream& os, const cString& cstr) {
    os << cstr.str;
    return os;
}

istream& operator>>(istream& is, cString& cstr) {
    char buffer[256];
    is.getline(buffer, 256);
    cstr.len = strlen(buffer);
    cstr.str = new char[cstr.len + 1];
    strcpy(cstr.str, buffer);
    return is;
}