#include<iostream>
using namespace std;

class Date
{
    private:
        int date,month,year;
    public:
        Date();
        Date(int, int, int);

        void display();
};


Date::Date()
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

void Date::display()
{
    cout<<"Date: "<<date<<"/"<<month<<"/"<<year<<"\n";
}

int main()
{
    int day;
    int month;
    int year;
    cout<<"Enter day, month, year:";
    cin>>day>>month>>year;
    Date d1;
    d1.display();

    Date d2(day,month,year);
    d2.display();
     

    
    return 0;
}

















































// Made with ❤️;