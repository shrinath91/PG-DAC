#include"Employee.h"
class SalesPersonEMP : public Employee
{
    int sales;
    int commission;
    public:
        SalesPersonEMP();
        SalesPersonEMP(const char*, int,double, int, int );
        SalesPersonEMP(SalesPersonEMP &);

        void display();
        void calculateSalary();
};