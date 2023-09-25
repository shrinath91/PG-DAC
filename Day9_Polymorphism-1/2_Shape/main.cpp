#include"Square.h"
#include"Triangle.h"
// #include<iostream>
int main()
{
    Shape *ptr1;

    ptr1 = new Square(5);
    cout<<ptr1->calculateArea()<<"\n";  
    cout<<ptr1->calculatePerimeter()<<"\n";
    
    ptr1 = new Triangle(3,4);
    cout<<ptr1->calculateArea()<<"\n";
    cout<<ptr1->calculatePerimeter()<<"\n";

    return 0;
}