#include<iostream>
using namespace std;
class Date
{
    private:
        int day, month, year;
    public:
        void setDate(int, int, int);
        void setDay(int);
        void setMonth(int);
        void setYear(int);

        void getDate();
        int getDay();
        int getMonth();
        int getYear();
};

void Date::setDate(int d, int m, int y)///////////////////////setter
{
    day=d;
    month=m;
    year=y;
}
void Date::setDay(int dd)
{
    day=dd;
}
void Date::setMonth(int mm)
{
    month=mm;
}
void Date::setYear(int yyyy)
{
    year=yyyy;
}


void Date::getDate()//////////////////////////////////////////getter
{
    cout<<"Date: ";
    cout<<day<<"/"<<month<<"/"<<year<<"\n";   
}
int Date::getDay()
{
    return day;
}
int Date::getMonth()
{
    return month;
}
int Date::getYear()
{
    return year;
}


int main()
{
    Date d1;
    int dd,mm,yyyy;
    cout<<"****Enter Date**** \n";
    cout<<"Enter Day:";
    cin>>dd;
    cout<<"\nEnter Month:";
    cin>>mm;
    cout<<"\nEnter Year:";
    cin>>yyyy;
    cout<<"\n";

    d1.setDate(dd,mm,yyyy);
    d1.getDate();

    cout<<"Enter Day: ";
    cin>>dd;
    d1.setDay(dd);
    cout<<"Day: "<<d1.getDay()<<"\n";
    cout<<"New ";
    d1.getDate();
    cout<<"\n";

    cout<<"Enter Month: ";
    cin>>mm;
    d1.setMonth(mm);
    cout<<"Month: "<<d1.getMonth()<<"\n";
    cout<<"New ";
    d1.getDate();
    cout<<"\n";

    cout<<"Enter Year: ";
    cin>>yyyy;
    d1.setYear(yyyy);
    cout<<"Year: "<<d1.getYear()<<"\n";
    cout<<"New ";
    d1.getDate();
    cout<<"\n";

    return  0; 
}


















































// Made with ❤️;