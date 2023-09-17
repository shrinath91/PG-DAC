#include<iostream>
using namespace std;
int multi(int=0, int=1, int=1);

int main()
{
    int res;
    res=multi(1, 2, 3);
    cout<<"\nFor 3 args 1*2*3: "<<res;
    res=multi(1, 2);
    cout<<"\nFor 2 args 1*2: "<<res;
    res=multi(1);
    cout<<"\nFor 1 args 1: "<<res;
    res=multi();
    cout<<"\nFor 0 args: "<<res;

    return  0; 
}
int multi(int a, int b, int c)
{
    int res = a*b*c;
    return res;
}












































































// Made with ❤️;