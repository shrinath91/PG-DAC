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
        Employee(const char*, int,  double);
        Employee(Employee &);

        void display();
        virtual void calculateSalary()=0;////////Pure virtual functio
};