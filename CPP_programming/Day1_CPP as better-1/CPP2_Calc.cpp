//made with ❤️;
#include<iostream>
using namespace std;
int add(int &, int &);
int sub(int &, int &);
int mul(int &, int &);
int divi(int &, int &);
int main()
{
    int num1,num2;
    cout<<"Enter two numbers: \n";
    cin>>num1>>num2;
    num1;
    num2;
    cout<<"Num1: "<<num1<<" Num2: "<<num2<<"\n";
    cout<<"Addition: "<<add(num1,num2)<<"\n";
    cout<<"Substraction: "<<sub(num1,num2)<<"\n";
    cout<<"Multiplication: "<<mul(num1,num2)<<"\n";
    cout<<"Division: "<<divi(num1,num2)<<"\n";

    return 0;
}


int add(int &a,int &b) 
{
    return a+b;
}
int sub(int &a, int &b)
{
    return a-b;
}
int mul(int &a, int &b)
{
    return a*b;
}
int divi(int &a, int &b)
{
    return a/b;   
}