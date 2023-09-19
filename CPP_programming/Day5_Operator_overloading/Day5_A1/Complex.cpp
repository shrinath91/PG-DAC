#include"Complex.h"

Complex::Complex()////////////////////constructor
{
    this->real=2;
    this->imag=3;
}
Complex::Complex(int r, int i)
{
    this->real=r;
    this->imag=i;
}
// Complex::Complex(int r=2, int i=3)//we can use this parameterized constructor, it works ad dafault constructor also
// {
//     this->real=r;
//     this->imag=i;
// }

int Complex::getReal() const//////////////////getter
{
    return this->real;
}
int Complex::getImag() const
{
    return this->imag;
}
void Complex::setData(int &r, int &i)///////////////////////////setter
{
    this->real=r;
    this->imag=i;
}

void Complex::display() const /////////////////facilitator
{
    // cout<<"\n";
    if(this->imag<0)
        cout<<"Value: "<<this->real<<this->imag<<"i"<<"\n";
    else
        cout<<"Value: "<<this->real<<"+"<<this->imag<<"i"<<"\n";

    cout<<"\n";
    
}

Complex Complex::operator+(Complex obj)///////////////////operator overloading
{
    Complex temp;
    temp.real=this->real+obj.real;
    temp.imag=this->imag+obj.imag;
    return temp;
}
Complex Complex::operator-(Complex obj)
{
    Complex temp;
    temp.real=this->real-obj.real;
    temp.imag=this->imag-obj.imag;
    return temp;
}
Complex Complex::operator*(Complex obj)
{
    Complex temp;
    temp.real=this->real*obj.real;
    temp.imag=this->imag*obj.imag;
    return temp;
}
Complex Complex::operator++()
{
    Complex temp;
    temp.real=this->real++;
    temp.imag=this->imag++;
    return temp;
}
Complex Complex::operator++(int a)
{
    Complex temp;
    temp.real= ++this->real;
    temp.imag= ++this->imag;
    return temp;
}
