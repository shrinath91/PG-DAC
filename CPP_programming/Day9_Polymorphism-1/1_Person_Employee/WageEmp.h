#include"Employee.h"

class WageEmp:public Employee
{
    double hrs;
    double rate;
    public:
        WageEmp();
        WageEmp(const char*, int, double, double, double);
        WageEmp(WageEmp &);
        void display();

        void calculateSalary();

};