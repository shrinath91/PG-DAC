#include"Person.h"

Person::Person()////////////////////////constructors
{
    age=0;
}
// Person::Person(Cstring nm, int age):name(nm)
// {
//     this->age=age;
// }
Person :: Person(const char * nm, int age):name(nm)
{
    this->age=age;
    // Cstring(nm);
}
Person::Person(Person &obj):name(obj.name)////////////////////////////////////copy constructor
{
    // name = obj.name;
    this->age=age;
}
void Person::display()/////////////////////////facilitators
{
    name.display();
    cout<<"Age: "<<age<<"\n";
}
