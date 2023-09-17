#include<iostream>
using namespace std;
void add(int, int);
void add(int, int, int);
void add(float, float);
void add(float, double);
void add(int, float);
void add(float, int);
//int add(int, int);  //function overloading can be done only with consideration of signature not return type 
                      //So at this line signature is same

int main()
{
    add(20, 40);
    add(20, 40, 60);
    add(1.5f, 2.5f);
    add(1.5f, 3.5f);
    add(5, 2.5f);
    add(2.5f, 5);
   
    return  0; 
}

void add(int a, int b)
{
    cout<<" \nadd(20,40): "<<a+b;
}
void add(int a, int b, int c)
{
    cout<<" \nadd(20,40,60): "<<a+b+c;
}
void add(float a, float b)
{
    cout<<" \nadd(1.5, 2.5): "<<a+b;
}
void add(float a, double b)
{
    cout<<" \nadd(1.5, 2.5): "<<a+b;
}
void add(int a, float b)
{
    cout<<" \nadd(5, 2.5): "<<a+b;
}
void add(float a, int b)
{
    cout<<" \nadd(2.5, 5): "<<a+b;
}
// int add(int a, int b)
// {
//     return a+b;
// }  //////////////////////////////////error expalined at line 8
















































// Made with ❤️;