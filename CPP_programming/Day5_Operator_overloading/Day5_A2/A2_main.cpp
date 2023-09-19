#include"Box.h"
// #include<iostream>
// using namespace std;

// class Box
// {
//     private:
//         int height, width, depth;
//     public:
//         Box();
//         Box(int ,int , int );

//         void setData(int ,int , int );


//         int calculate_Volume();/////////facilitators
//         void display();

//         bool operator<(Box &);
//         bool operator>(Box &);
//         bool operator==(Box &);
// };

// // #include"Box.h"

// Box::Box()/////////////////////////constructor
// {
//     height=10;  
//     width=10;  
//     depth=10;  
// }
// Box::Box(int h,int w, int d)
// {
//     height=h;
//     width=w;
//     depth=d;
// }


// void Box::setData(int h, int w, int d)////////////////////////////////setter
// {
//     height=h;
//     width=w;
//     depth=d;
// }

// int Box::calculate_Volume()/////////////////////facilitator
// {
//     return height*width*depth;
// }
// void Box::display()
// {

//     cout<<"Values: "<<endl ;   
//     cout<<"Height:"<<height<<endl ;   
//     cout<<"Width:"<<width<<endl ;
//     cout<<"Depth:"<<depth<<endl<<endl ;
// }


// bool Box::operator<(Box &obj)///////////////////////////operator overload
// {
//     if(this->calculate_Volume() < obj.calculate_Volume())
//         return 1; 
//     else
//         return 0;
// }
// bool Box::operator>(Box &obj)
// {
//     if(this->calculate_Volume() > obj.calculate_Volume())
//         return 1; 
//     else
//         return 0;
// }
// bool Box::operator==(Box &obj)
// {
//     if(this->calculate_Volume() == obj.calculate_Volume())
//         return 1; 
//     else
//         return 0;
// }

int main()
{
    Box b1;//10 10 10
    cout<<"Default values:\n";
    b1.display();

    Box b2(20,30,40);
    // b2.display();
    
   
    if(b1<b2)  // b1.operator<(b2);  // 
        cout<<"b1's volume is Smaller than b2\n";
    else
        cout<<"b2's volume is Smaller than b1\n";
    //
    if(b1>b2)
        cout<<"b1's volume is Greater than b2\n";
    else
        cout<<"b2's volume is Greater than b1\n";
    //
    Box b3=b2;
    // b3.display();

    if(b2==b3)
        cout<<"b1's volume is Equal to b2\n";
    else
        cout<<"b2's volume is Not Equal to b1\n";

    return 0;
}

































































// Made with ❤️;