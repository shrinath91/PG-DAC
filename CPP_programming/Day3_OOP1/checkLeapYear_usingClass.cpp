#include <iostream>
using namespace std;

class Date {
private:
    int day, month, year;

public:
    void setDate(int, int, int);
    void display(char);
    int getDay();
    int getMonth();
    int getYear();
    void checkDate();
};

void Date::setDate(int dd, int mm, int yy) {
    day = dd;
    month = mm;
    year = yy;
}

void Date::display(char ch) 
{
    if (ch == '/') {
        cout << "The date that you entered is: " << day << "/" << month << "/" << year << endl;
    } else {
        cout << "The date that you entered is: " << day << ":" << month << ":" << year << endl;
    }
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

void Date::checkDate() 
{
    if (1 <= day && day <= 31 && 1 <= month && month <= 12 && 1990 <= year && year <= 2030) 
    {
        if (year % 4 == 0 && month == 2 && day >= 1 && day <= 29) 
        {
            cout << "Leap year: " << day << "/" << month << "/" << year << endl;
        } 
        else if (year % 4 == 0 && month == 2 && day >= 1 && day >= 29) 
        {
            cout << "Date is invalid: " << day << "/" << month << "/" << year << endl;
        } 
        else if ((year % 4 != 0 || year % 4 == 0) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day >= 1 && day >= 31) 
        {
            cout << "Month is of 31 days: " << day << "/" << month << "/" << year << endl;
        } 
        else if ((year % 4 != 0 || year % 4 == 0) && (month == 4 || month == 6 || month == 9 || month == 11) && day >= 1 && day >= 30) 
        {
            cout << "Month is of 30 days: " << day << "/" << month << "/" << year << endl;
        } 
        else 
        {
            cout << "Date is invalid" << endl;
        }
    }
}

int main() 
{
    int dd, yy, mm;
    int size;
    char ch;

    cout << "Enter the array size: ";
    cin >> size;
    Date *dates = new Date[size];

    cout << "Enter the char: ";
    cin >> ch;

    for (int i = 0; i < size; i++) 
    {
        cout << "Enter date: ";
        cin >> dd >> mm >> yy;
        dates[i].setDate(dd, mm, yy);
    }

    for (int i = 0; i < size; i++) 
    {
        dates[i].display(ch);
    }

    for (int i = 0; i < size; i++) 
    {
        dates[i].checkDate();
    }

    delete[] dates;

    return 0;
}
