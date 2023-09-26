#include"Cstring.h"
int main()
{
    Cstring c1("Hello");
    Cstring c2("hello");

    int res;
    /// res=c1.operator<(c2); //implicit call
    res=c1<c2;
    cout<<"Res: "<<res<<"\n";
    if(res==-1)
        cout<<"1"<<"\n";
    else if(res==1)
        cout<<"0"<<"\n";

    res=c1>c2;
    cout<<"Res: "<<res<<"\n";
    if(res==1)
        cout<<"1"<<"\n";
    else if(res==-1)
        cout<<"0"<<"\n";
    
    res=c1==c2;
    cout<<"Res: "<<res<<"\n";
    if(res==0)
        cout<<"1"<<"\n";
    else if(res!=0)
        cout<<"0"<<"\n";

    c1=c2;
    c1.display();
    
    cout<<"c1[0]: "<<c1[0]<<"\n";
    cout<<"c1[1]: "<<c1[1]<<"\n";
    cout<<"c1[2]: "<<c1[2]<<"\n";
    cout<<"c1[3]: "<<c1[3]<<"\n";
    cout<<"c1[4]: "<<c1[4]<<"\n";
    


    
    return 0;
}
