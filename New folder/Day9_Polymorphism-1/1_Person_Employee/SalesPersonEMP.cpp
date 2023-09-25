#include"SalesPersonEMP.h"

SalesPersonEMP::SalesPersonEMP()
{

}
SalesPersonEMP::SalesPersonEMP(const char* nm, int age, double sal,int sales, int commission):Employee(nm,sal,age)
{
    this->sales=sales;
    this->commission=commission;
}
SalesPersonEMP::SalesPersonEMP(SalesPersonEMP &obj):Employee(obj)
{
    this->sales = obj.sales;
    this->commission = obj.commission;
}

void SalesPersonEMP::display()
{
    Employee::display();
    cout<<"**Sales: "<<sales<<"\n";
    cout<<"**Commission: "<<commission<<"\n\n";
    calculateSalary();

    cout<<"##################################\n";
}
void SalesPersonEMP::calculateSalary()
{
    sal=sal+(sales*commission);
    cout<<"In Hand Salary: "<<sal<<"\n";
}
