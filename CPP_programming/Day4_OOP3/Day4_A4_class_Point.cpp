#include<iostream>
using namespace std;

class Point
{
    private:
        int x;
        int y;
    public:
        Point();

        static int cnt;

        void accept();
        void display();


};
int Point::cnt=0;//////////////globally static var declared

Point::Point()
{
    x=0;
    y=0;
    cnt++;
}
void Point::accept()//////facilitator
{
    cout<<"Enter X Co-ordinates: ";
    cin>>x;
    cout<<"Enter Y Co-ordinates: ";
    cin>>y;
}
void Point::display()
{
    cout<<"Co-ordinates "<<cnt<<":"<<"["<<x<<","<<y<<"]\n";
}

int main()
{
    Point p1;
    p1.accept();
    p1.display();

    Point p2;
    p2.accept();
    p2.display();

    Point p3;
    p3.display();
    cout<<Point::cnt;

    return 0;
    
}












































// Made with ❤️;