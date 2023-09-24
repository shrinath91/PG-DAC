#include<iostream>
using namespace std;
class Calculator
{
    private:
        int num1,num2;
    public:
        void accept();
        void display();
        void add();
        void sub();
        void mul();
        void div();

};

void Calculator::accept()
{
    cout<<"Enter Num1: ";
    cin>>num1;
    cout<<"Enter Num2: ";
    cin>>num2;
}
void Calculator::display()
{
    cout<<"****Entered values are****\n";
    cout<<"Num1: "<<num1<<"\n";
    cout<<"Num2: "<<num2<<"\n";
}
void Calculator::add()
{
    cout<<"Add: "<<num1<<"+"<<num2<<"= "<<this->num1+this->num2<<"\n";
}
void Calculator::sub()
{
    cout<<"Sub: "<<num1<<"-"<<num2<<"= "<<this->num1-this->num2<<"\n";
}
void Calculator::mul()
{
    cout<<"Mul: "<<num1<<"*"<<num2<<"= "<<this->num1*this->num2<<"\n";
}
void Calculator::div()
{
    cout<<"Div: "<<num1<<"/"<<num2<<"= "<<this->num1/this->num2<<"\n";
}

int main()
{
    Calculator c1;
    c1.accept();
    c1.display();

    c1.add();
    c1.sub();
    c1.mul();
    c1.div();

    
    return 0;
}
        
























































































// Made with ❤️;