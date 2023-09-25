#pragma once
#include"Person.h"

class Employee:public Person
{
    private:
        static int cnt;
        int e_id;
    protected:
        double sal;
    public:
        Employee();
        Employee(const char*, double, int );
        Employee(Employee &);

        void display();
};