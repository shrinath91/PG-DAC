#include"Employee.h"
class SalesPersonEMP : public Employee
{
    int sales;
    int commission;
    public:
        SalesPersonEMP();
        SalesPersonEMP(int, int, const char* , double , int );
        SalesPersonEMP(SalesPersonEMP &);

        void display();
        void calculateSalary();
};