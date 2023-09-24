#pragma once
#include<iostream>
using namespace std;
class Shape
{
    protected:
        long area;
        long perimeter;
    public:
        // Shape();
        // Shape(long, long);//not required cuz its abstract class, object cant be created
        virtual long calculateArea()=0;
        virtual long calculatePerimeter()=0;
};