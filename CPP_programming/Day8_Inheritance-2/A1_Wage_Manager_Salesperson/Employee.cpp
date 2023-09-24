#include"Employee.h"


int Employee:: cnt=0;
Employee::Employee()///////////////////////constructor
{
    cnt++;
    e_id=cnt;
    sal=0;
}
Employee::Employee(const char* nm, double sal, int age):Person(nm,age)
{
    cnt++;
    e_id=cnt;
    this->sal=sal;
}
Employee::Employee(Employee &obj):Person(obj)///////////////copy constructor
{
    cnt++;
    this->e_id=cnt;
    this->sal=obj.sal;
    //strcpy(this->name,obj.name);//in this line there is no object of person created directly so we cant call person's variables with obj.name
    //this->bdate=obj.bdate
}
 
void Employee::display()//in this function display() is overidden
{
    cout<<"Employee Id: "<<e_id<<"\n";
    Person::display();
    cout<<"Employee Base Salary: "<<sal<<"\n\n";
}