#include"WageEmp.h"

int main()
{
    WageEmp w1;
    w1.display();

    WageEmp w2(12,200,"Ranga", 29,5,2001, 20000);
    w2.display();

    WageEmp w3(w2);
    w2.display();

    return 0;
}