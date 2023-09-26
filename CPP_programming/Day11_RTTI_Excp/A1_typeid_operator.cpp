// 1. Declare variable with built in data type like(int,char,float,char[]).
//    Declare class and check it's data type at runtime.
//    a.use typeid operator and check data type of all variable at runtime.
//    b.In same cpp file write note on typeinfo class typeid operator.

#include<iostream>
#include<typeinfo>
using namespace std;
class Test
{

};

int main()
{
    Test t1;
    int a=5, b=6;
    char ch='A';
    float f;
    double d;
    if(typeid(a)==typeid(b))
        cout<<"Same data type!!!\n";
    else
        cout<<"NOT same data type!!!\n";

    cout<<"a is of "<<typeid(a).name()<<endl;
    cout<<"ch is of "<<typeid(ch).name()<<endl;
    cout<<"f is of "<<typeid(f).name()<<endl;
    cout<<"d is of "<<typeid(d).name()<<endl;
    cout<<"t1 is of "<<typeid(t1).name()<<endl;


}