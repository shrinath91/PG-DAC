#include"Triangle.h"

Triangle::Triangle()
{
    base=5;
    height=5;
}
Triangle::Triangle(int b, int h)
{
    base=b;
    height=h;
}
long Triangle::calculateArea()
{
    cout<<"Area of Triangle: ";
    area=0.5*base*height;
    return area;
}
long Triangle::calculatePerimeter()
{
    cout<<"Area of Triangle: ";
    perimeter=+height;
    return perimeter;
}