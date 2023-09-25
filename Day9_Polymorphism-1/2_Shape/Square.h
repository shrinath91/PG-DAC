#include"Shape.h"

class Square:public Shape
{
    private:
        int side;
    public:
        Square();
        Square(int );
        long calculateArea();
        long calculatePerimeter();
};