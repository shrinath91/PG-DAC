#include<iostream>
using namespace std;

class Complex
{
    private:
        int real, imag;
    public:
        Complex();
        Complex(int, int);

        int getReal() const;
        int getImag() const;
        
        void display() ;
};


Complex::Complex()////////////////////constructor
{
    real=1;
    imag=1;
}
Complex::Complex(int r, int i)
{
    real=r;
    imag=i;
}

int Complex::getReal() const//////////////////getter
{
    return real;
}
int Complex::getImag() const
{
    return imag;
}

void Complex::display() /////////////////facilitator
{
    if(imag<0)
        cout<<"Value: "<<real<<imag<<"i"<<"\n";
    else
        cout<<"Value: "<<real<<"+"<<imag<<"i"<<"\n";
}

int main()
{
    int real, imag;
    Complex c1;
    cout<<"Real: "<<c1.getReal()<<"\n";//non const objects can access const member function
    cout<<"Imag: "<<c1.getImag()<<"\n";//non const objects can access const member function
    c1.display();

    Complex c2(2,3);
    c1.display();

    Complex c3(1,-2);
    c3.display();
     
    Complex const c4;
    //c4.display(); //error: const object can't access non const member function, it can only and only access const member function
    cout<<"Real: "<<c4.getReal()<<"\n";
    cout<<"Imag: "<<c4.getImag()<<"\n";
    
    Complex const c5(5,6);
    //c5.display();
    cout<<"Real: "<<c5.getReal()<<"\n";
    cout<<"Imag: "<<c5.getImag()<<"\n";
    
    return 0;
}













































































// Made with ❤️;