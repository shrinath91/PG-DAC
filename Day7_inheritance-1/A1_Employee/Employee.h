#include"Person.h"

class Employee:public Person
{
    static int cnt;
    int e_id;
    double sal;
    public:
        Employee();
        Employee(const char*, int,int,int, double);
        Employee(Employee &);

        void display();
};