#include"Shape.h"

class Triangle:public Shape
{
    private:
        int base;
        int height;
    public:
        Triangle();
        Triangle(int , int );
        long calculateArea();
        long calculatePerimeter();
};