#include"WageEmp.h"

WageEmp::WageEmp()///////////////constructor
{
    hrs=0;
    rate=0;
}
//         WageEmp(double, double, const char*,int, double);
WageEmp::WageEmp(const char* nm, int age, double sal, double hrs, double rate):Employee(nm,age,sal)
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

