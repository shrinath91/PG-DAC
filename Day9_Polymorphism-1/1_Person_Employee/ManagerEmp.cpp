#include"ManagerEmp.h"

ManagerEMP::ManagerEMP()
{

}
ManagerEMP::ManagerEMP(const char* nm, int age, double sal, double ta, double hra):Employee(nm,sal,age)
{
    this->ta=ta;
    this->hra=hra;
}
ManagerEMP::ManagerEMP(ManagerEMP &obj):Employee(obj)
{
    this->ta=obj.ta;
    this->hra=obj.hra;
}

void ManagerEMP::display()
{
    Employee::display();
    cout<<"**Travelling Allowance: "<<ta<<"\n";
    cout<<"**HRA: "<<hra<<"\n\n";
    calculateSalary();
    cout<<"##################################\n";


}
void ManagerEMP::calculateSalary()
{
    sal=sal+ta+hra;
    cout<<"In Hand Salary: "<<sal<<"\n";
}
