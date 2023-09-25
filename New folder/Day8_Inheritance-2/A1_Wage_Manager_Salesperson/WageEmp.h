#include"Employee.h"

class WageEmp:public Employee
{
    double hrs;
    double rate;
    public:
        WageEmp();
        WageEmp(double, double, const char*,int, double);
        WageEmp(WageEmp &);
        void display();

        void calculateSalary();

};