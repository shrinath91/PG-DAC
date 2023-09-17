#include"Box.h"

Box::Box()/////////////////////////constructor
{
    height=10;  
    width=10;  
    depth=10;  
}
Box::Box(int h,int w, int d)
{
    height=h;
    width=w;
    depth=d;
}


void Box::setData(int h, int w, int d)////////////////////////////////setter
{
    height=h;
    width=w;
    depth=d;
}

int Box::calculate_Volume()/////////////////////facilitator
{
    return height*width*depth;
}
void Box::display()
{
cout<<"Height:"<<height<<endl ;   
cout<<"Width:"<<width<<endl ;
cout<<"Depth:"<<depth<<endl<<endl ;
}


bool Box::operator<(Box &obj)///////////////////////////operator overload
{
    if(this->calculate_Volume() < obj.calculate_Volume())
        return 1; 
    else
        return 0;
}
bool Box::operator>(Box &obj)
{
    if(this->calculate_Volume() > obj.calculate_Volume())
        return 1; 
    else
        return 0;
}
bool Box::operator==(Box &obj)
{
    if(this->calculate_Volume() == obj.calculate_Volume())
        return 1; 
    else
        return 0;
}