#include<iostream>
using namespace std;

class Point
{
    private:
        int x;
        int y;
    public:
        void accept();
        void display();


};
void Point::accept()//////facilitator
{
    cout<<"Enter X Co-ordinates: ";
    cin>>x;
    cout<<"Enter Y Co-ordinates: ";
    cin>>y;
}
void Point::display()
{
    cout<<"Co-ordinates: "<<"["<<x<<","<<y<<"]\n";
}

int main()
{
    Point p1;
    p1.accept();
    p1.display();

    return 0;
    
}
































































// Made with ❤️;