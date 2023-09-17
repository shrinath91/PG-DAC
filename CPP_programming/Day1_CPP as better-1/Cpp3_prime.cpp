//made with ❤️;
#include<iostream>
using namespace std;
void prime(int &);
int main()
{
    int num;
    cout<<"Enter a number to check either its prime or not: ";
    cin>>num;
    prime(num);

    return 0;
}
void prime(int &n)
{
    int i;
    if (n==0 || n==1)
    {
        cout<<n<<" is NOT prime Number\n";
    }
    // else if (n==2)////////////not required
    // {
    //     cout<<n<<" is prime Number\n";
    // }
    else 
    {
        for(i=2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                cout<<n<<" is NOT prime Number\n";
                return;
            }
        } 
        cout<<n<<" is prime Number\n";

    } 
}