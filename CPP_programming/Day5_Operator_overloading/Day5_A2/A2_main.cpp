#include"Box.h"

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