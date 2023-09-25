#include<iostream>
using namespace std;

class Date
{
    private:
        int date,month,year;
    public:
        Date();
        Date(int, int, int);
        Date(Date &);

        void display();
};
