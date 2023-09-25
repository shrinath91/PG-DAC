#include"Batsman.h"
int main()
{
    Batsman b1;
    b1.display();
    cout<<"**Batting AVG: "<<b1.calcAvg()<<"\n\n";

    Batsman b2("Shri",10,2,300);
    b2.display();
    cout<<"**Batting AVG: "<<b2.calcAvg()<<"\n\n";

    Batsman b3(b2);
    b3.display();
    cout<<"**Batting AVG: "<<b3.calcAvg()<<"\n\n";

    Batsman b4("Battya",7,3,150);
    b4.display();
    cout<<"**Batting AVG: "<<b1.calcAvg()<<"\n\n";

    return 0;
}