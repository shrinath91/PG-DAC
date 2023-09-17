#include<iostream>
using namespace std;

class Time
{
    private:
        int hour, min, sec;
    public:
        Time();
        Time(int, int, int);

        void display();


};

Time::Time()////////////constructor
{
    hour=0;
    min=0;
    sec=0;
}
Time::Time(int h, int m, int s) 
{
    hour=h;
    min=m;
    sec=s;
}

void Time::display()//////////////////////facilitator
{
    cout<<"Time: "<<hour<<":"<<min<<":"<<sec<<"\n"; 
}


int main()
{
    Time t1;
    t1.display();

    Time t2(12,12,12);
    t2.display();

    return  0; 
}






















































// Made with ❤️;