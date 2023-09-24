#include"WageEmp.h"
#include"ManagerEmp.h"
#include"SalesPersonEMP.h"

int main()
{
    WageEmp w1(12,200,"Shri",19,20000);
    w1.display();

    ManagerEMP m1("Hari",40000,37,5000,20000);
    m1.display();

    SalesPersonEMP s1(20,100,"karn",30000,28);
    s1.display();

    return 0;
}
