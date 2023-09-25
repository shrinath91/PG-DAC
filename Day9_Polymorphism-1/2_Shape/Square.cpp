#include"Square.h"

Square::Square()
{
    side=5;
}
Square::Square(int s)
{
    side=s;
}
long Square::calculateArea()
{
    cout<<"Area of Square: ";
    area=(side*side); 
    return area;
}
long Square::calculatePerimeter()
{
    cout<<"Perimeter of Square: ";
    perimeter=4*side;
    return perimeter;
}