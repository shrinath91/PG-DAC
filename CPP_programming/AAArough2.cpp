#include <iostream>
using namespace std;

class Date
{
private:
    int day, month, year;

public:
    Date(int, int, int);
    Date();
    void Display();
};

void Date::Display()
{
    cout << day << "/" << month << "/" << year;
}

Date::Date(int d, int m, int y)
{
    day = d;
    month = m;
    year = y;
}
Date::Date()
{
    day = 1;
    month = 1;
    year = 2001;
}

class String
{
    int len;
    char *str;

public:
    String();
    String(const char *);
    String(String &);
    void Display() const;
};

String::String()
{
    len = 1;
    str = new char[len];
    str[0] = '\0';
}
String::String(const char *str)
{
    this->len = strlen(str);
    this->str = new char[this->len + 1];
    strcpy(this->str, str);
}
void String::Display() const
{
    cout << endl
         << "Name : " << str;
}

String::String(String &s)
{
    this->len = s.len;
    this->str = new char[this->len];
    strcpy(this->str, str);
}

class Person
{
    int rollno;
    String name;
    Date dob;
    Date adddate;

public:
    void Display();
    Person();
    Person(const char *, int rno, int d1, int m1, int y1, int d2, int m2, int y2);
};

void Person::Display()
{
    cout << "\n\nRollNo :" << rollno;
    name.Display();
    cout << "\nBirth Date: ";
    dob.Display();
    cout << "\nAdmission Date: ";
    adddate.Display();
}

Person::Person(const char *str, int rno, int d1, int m1, int y1, int d2, int m2, int y2) : dob(d1, m1, y1), adddate(d2, m2, y2), name(str)
{
    rollno = rno;
}

Person::Person()
{
    rollno = 0;
}

int main()
{
    Person *p[5];

    int rno, d1, m1, y1, d2, m2, y2;
    char nm[20];

    for (int i = 0; i < 5; i++)
    {
        cout << "\n Enter Name and roll no of student no " << i + 1;
        cin >> nm >> rno;
        cout << "\n Enter Date of birth :";
        cin >> d1 >> m1 >> y1;
        cout << "\n Enter Date of Admission :";
        cin >> d2 >> m2 >> y2;
        p[i] = new Person(nm, rno, d1, m1, y1, d2, m2, y2);
    }
    for (int i = 0; i < 5; i++)
    {
        p[i]->Display();
    }
}