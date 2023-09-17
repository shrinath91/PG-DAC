#include <iostream>
using namespace std;
class date
{
private:
    int date, month, year;

public:
    void setDate(int, int, int);
    void display(char);
    int getDay(int);
    int getMonth(int);
    int getYear(int);
    void checkdate();
};

void date::setDate(int dd, int mm, int yy)
{
    date = dd;
    month = mm;
    year = yy;
}

void date ::display(char ch)
{
    if (ch == '/')
    {
        cout << "The date that you entered is : " << date
             << "/" << month << "/" << year << endl;
    }
    else
    {
        cout << "The date that you entered is : " << date
             << ":" << month << ":" << year << endl;
    }
}
int date::getDay(int d)
{
    return d;
}
int date::getMonth(int m)
{
    return m;
}
int date::getYear(int y)
{
    return y;
}
void date ::checkdate()
{
        if (1 <= date && date <= 31 && 1 <= month && month <= 12 && 1990 <= year && year <= 2030)
    {
        if (year % 4 == 0 && month == 2 && date >= 1 && date <= 29)
        {
            cout << "leap year : " << date << "/" << month << "/" << year << endl;
            ;
        }
        else if (year % 4 == 0 && month == 2 && date >= 1 && date >= 29)
        {
            cout
                << "Date is invalid : " << date << "/" << month << "/" << year << endl;
        }
        else if (year % 4 != 0 || year % 4 == 0 && month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12 && date >= 1 && date >= 31)
        {
            cout
                << "month is of 31 days : " << date << "/" << month << "/" << year << endl;
        }
        else if (year % 4 != 0 || year % 4 == 0 && month == 4 && month == 6 && month == 9 && month == 11 && date >= 1 && date >= 30)
        {
            cout
                << "month is of 30 days : " << date << "/" << month << "/" << year << endl;
        }
        else
        {
            cout << "date is invalid" << endl;
        }
    }
    
}


int main()
{
    int dd, yy, mm;
    int temp, temp2, temp3, size;
    int *arr;
    char ch;
    cout << "Enter the array size : ";
    cin >> size;
    arr = new int[size];
    date d[size];
    cout << "Enter the char : ";
    cin >> ch;

    for (int i = 0; i < size; i++)
    {
        cout << "Enter date : ";
        cin >> dd >> yy >> mm;
        d[i].setDate(dd, yy, mm);
    }
    for (int i = 0; i < size; i++)
    {
        d[i].display(ch);
    }
    for (int i = 0; i < size; i++)
    {
        temp = d[i].getDay(ch);
    }
    for (int i = 0; i < size; i++)
    {
        temp2 = d[i].getMonth(ch);
    }
    for (int i = 0; i < size; i++)
    {
        temp3 = d[i].getYear(ch);
    }
    for (int i = 0; i < size; i++)
    {
        d[i].checkdate();
    }

    return 0;
}












































































// Made with ❤️;