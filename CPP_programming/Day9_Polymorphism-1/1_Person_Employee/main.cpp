#include"WageEmp.h"
#include"ManagerEmp.h"
#include"SalesPersonEMP.h"

int main()
{
    Person *ptr[4];
    ptr[0] = new Person("Raghav",39);
    // ptr[1] = new Employee("Hari",32,32000);//Error:we cannot create object of abstract class
    ptr[1] = new WageEmp("Srirang",24,24000,12,200);
    ptr[2] = new ManagerEMP("Ranga",52,52000,5000,20000);
    ptr[3] = new SalesPersonEMP("John",29,29000,11,1000);

    for(int i=0; i<4; i++)
    {
        ptr[i]->display();
    }
    
    Employee *p[3];
    // p[0]=new Person("Raghav",39)//Error: base class object cant be stored in derived class pointer
    // p[0]=new Employee("Hari",32,32000);//Error:we cannot create object of abstract class
    p[0]=new WageEmp("Srirang",24,24000,12,200);
    p[1]=new ManagerEMP("Ranga",52,52000,5000,20000);
    p[2]=new SalesPersonEMP("John",29,29000,11,1000);
    for(int i=0; i<3; i++)
    {
        p[i]->calculateSalary();
    }
    return 0;
}