#include<iostream>
using namespace std;

// template <class M>
template<class P>
void searchEle(P *a, int size, P &k)
{
    int index;
    for(int i=0; i<size; i++)
    {
        if(a[i]==k)
        { 
            index=i;
            cout<<"Number found at Index "<<i+1<<"\n";
            return;
        }
    }
    cout<<"Number not found!!!\n";
}


int main()
{
    int i_key, size=10;
    int *i_arr=new int[size];
    cout<<"Enter Array of 10 numbers: ";
    for(int i=0; i<size; i++)
    {
        cin>>i_arr[i];
    }
    cout<<"\n";
    cout<<"Array of 10 numbers : | ";
    for(int i=0; i<size; i++)
    {
        cout<<i+1<<":"<<i_arr[i]<<" | ";
    }
    cout<<"\n";
    cout<<"\nEnter Number to search from array:\nKey: ";
    cin>>i_key;
    searchEle(i_arr, size, i_key);
    
    
    char c_key;
    char *c_arr=new char[size];
    cout<<"Enter Array of 10 numbers: ";
    for(int i=0; i<size; i++)
    {
        cin>>c_arr[i];
    }
    cout<<"\n";
    cout<<"Array of 10 character : | ";
    for(int i=0; i<size; i++)
    {
        cout<<i+1<<":"<<c_arr[i]<<" | ";
    }
    cout<<"\n";
    cout<<"\nEnter character to search from Array:\nKey: ";
    cin>>c_key;
    searchEle(c_arr, size, c_key );

    return 0;
}
