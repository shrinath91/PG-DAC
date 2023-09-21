 #include"Person.h"

 int main()
 {
    Person p1;
    p1.display();
    cout<<"\n";

    Person p2("Shri",2,2,2022);
    p2.display();
    cout<<"\n";

    Cstring c1("Ranga");
    Date d1(3,3,2003);
    Person p3(c1,d1);
    p3.display();
    cout<<"\n";

    Person p4=p3;
    p4.display();
    cout<<"\n";

    return 0;
 }