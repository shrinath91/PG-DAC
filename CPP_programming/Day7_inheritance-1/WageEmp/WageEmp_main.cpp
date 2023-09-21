#include"WageEmp.h"

int main()
{
    WageEmp w1;
    w1.display();

    WageEmp w2(12,200,"Ranga", 29,5,2001,0);
    w2.setSal();
    w2.display();

    WageEmp w3(w2);
    w3.setSal();
    w3.display();

    WageEmp w4(15,200,"Bandya",1,1,2001,0);
    w4.setSal();
    w4.display();

    return 0;
}