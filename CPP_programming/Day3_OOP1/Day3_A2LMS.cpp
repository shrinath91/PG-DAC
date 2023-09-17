#include<iostream>
using namespace std;
class Date
{
    private:
        int day, month, year;
    public:
        void setDate(int, int, int);
        void getDate();
};
void Date::setDate(int d, int m, int y)
{
    day=d;
    month=m;
    year=y;
}
void Date::getDate()
{
    cout<<"Date: ";
    cout<<day<<"/"<<month<<"/"<<year<<"\n";   
}
int main()
{
    Date d1;
    d1.setDate(1,12,1998);
    d1.getDate();
    return  0; 
}







































































// Made with ❤️;