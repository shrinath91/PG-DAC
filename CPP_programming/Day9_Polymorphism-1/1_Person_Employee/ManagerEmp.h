#include"Employee.h"

class ManagerEMP : public Employee
{
    double ta;
    double hra;
    public:
        ManagerEMP();
        ManagerEMP(const char*, int, double,double, double);
        ManagerEMP(ManagerEMP &);

        void display();
        void calculateSalary();

};