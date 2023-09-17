//made with ❤️;
#include<iostream>
using namespace std;
void swap(int &, int &);
int main()
{
    int num1, num2;
    cout<<"Enter a two number to swap them: ";
    cin>>num1>>num2;
    cout<<"Num1: "<<num1<<" Num2: "<<num2<<"\n";
    swap(num1,num2);
    cout<<"Num1: "<<num1<<" Num2: "<<num2<<"\n";

    return 0;
}
void swap(int &a, int &b) //a=2 , b=3
{
    a=a+b;   //a=5, b=3
    b=a-b;   //a=5, b=2
    a=a-b;   //a=3, b=2
}