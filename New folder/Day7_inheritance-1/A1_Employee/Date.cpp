#include"Date.h"

Date::Date()//////////////constructor
{
    date=1;
    month=1;
    year=2000;
}
Date::Date(int d, int m, int y)
{
    date=d;
    month=m;
    year=y;
}
Date::Date(Date &obj)
{
    date = obj.date;
    month = obj.month;
    year = obj.year;
}
void Date::display()///////////////facilitator
{
    cout<<"Date: "<<date<<"/"<<month<<"/"<<year<<"\n";
}













































// Made with ❤️;