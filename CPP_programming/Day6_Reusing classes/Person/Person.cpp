  #include"Person.h"

Person::Person()////////////////////////constructors
{

}
Person::Person(Cstring nm, Date bd):name(nm),b_date(bd)
{
    //Cstring(nm);
    //Date(bd);
}
Person :: Person(const char * nm, int d, int m, int y)//:name(nm),b_date(d,m,y)
{
    // Cstring(nm); //some error
    // Date(d,m,y);
}
Person::Person(Person &obj):name(obj.name), b_date(obj.b_date)
{
    // name = obj.name;
    // b_date = obj.b_date;
}
void Person::display()/////////////////////////facilitators
{
    name.display();
    b_date.display();
}
