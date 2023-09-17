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
        void setData(int &, int &);
        
        void display() const;
        Complex operator+(Complex);
        Complex operator-(Complex);
        Complex operator*(Complex);

        Complex operator++();
        Complex operator++(int);

};