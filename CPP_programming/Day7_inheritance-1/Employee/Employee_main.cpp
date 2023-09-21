#include"Employee.h"
int main()
{
    Employee e1;
    e1.display();

    Employee e2("Shri", 29,05,2001, 100000);
    e2.display();

    Employee e3(e2);
    e3.display();

    return 0;
}