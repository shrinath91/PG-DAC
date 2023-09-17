//made with ❤️;
#include<iostream>
using namespace std;
void add_product(int &, int &);

int main()
{
    int num1,num2;
    cout<<"Enter two numbers: \n";
    cin>>num1>>num2;
    num1;
    num2;
    cout<<"Num1: "<<num1<<" Num2: "<<num2<<"\n";
    add_product(num1, num2);
    cout<<"Addition: "<<num1<<"\n";
    cout<<"Product: "<<num2<<"\n";

    return 0;
}


void add_product(int &a,int &b) 
{
    int a1=a+b;
    int b1=a*b;
    a=a1;
    b=b1;
}
