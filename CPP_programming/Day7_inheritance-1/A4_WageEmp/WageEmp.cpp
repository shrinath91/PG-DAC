#include"WageEmp.h"

WageEmp::WageEmp()///////////////constructor
{
    hrs=0;
    rate=0;
}
WageEmp::WageEmp(double hrs, double rate, const char* nm, int d,int m,int y, double sal):Employee(nm,d,m,y,sal)
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

}

void WageEmp::setSal()
{
    Employee::setSal(this->hrs*this->rate);
}