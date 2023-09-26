#pragma once
#include<iostream>
#include<Cstring>
using namespace std;
class Employee
{
    char name[10];
    public:
        Employee()
        {
            strcpy(name,"NA");
        }
        Employee(const char *nm)
        {
            strcpy(name,nm);
        }
        virtual void test()
        {
            cout<<"Inside test() of Emp\n";
        }
        virtual void display()
        {
            cout<<this->name<<"\n";
        }
};
