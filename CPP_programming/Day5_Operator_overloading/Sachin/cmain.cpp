#include"cstring.h"

int main()
{
    cout<<endl<<endl;
    cstring c1("A");
    c1.Display();
    cout<<endl<<endl;
    cstring c2("a");
    c2.Display();
    cout<<endl<<endl;
    cout<<endl<<endl;
    cstring c3=c2;
    c3.Display();
    int temp=c1<c2;

    if (temp==1)
    {
        cout<<endl<<"c1 string is greater than c2";
    }
    else if (temp==-1)
    {
        cout<<endl<<"c2 is greater than c2";
    
    }
    else
    {
        cout<<endl<<"c1 is equal to c2";
    }
    
cout<<endl<<endl;
    cstring c4;
    c4=c1;
    c4.Display();


}