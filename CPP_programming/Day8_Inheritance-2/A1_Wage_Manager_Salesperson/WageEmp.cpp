#include"WageEmp.h"

WageEmp::WageEmp()///////////////constructor
{
    hrs=0;
    rate=0;
}
//         WageEmp(double, double, const char*,int, double);
WageEmp::WageEmp(double hrs, double rate, const char* nm, int age, double sal):Employee(nm,sal,age)
{
    this->hrs=hrs;
    this->rate=rate;
}
WageEmp::WageEmp(WageEmp &obj):Employee(obj)/////////////////copy constructor
{
    this->hrs=obj.hrs;
    this->rate=obj.rate;
}
void WageEmp::display()/////////////facilitators
{
    Employee::display();
    cout<<"**Hours: "<<hrs<<"\n";
    cout<<"**Rate: "<<rate<<"\n\n";
    calculateSalary();
    cout<<"##################################\n";

}
void WageEmp::calculateSalary()
{
    sal=sal+(hrs*rate);
    cout<<"In Hand Salary: "<<sal<<"\n";
}

