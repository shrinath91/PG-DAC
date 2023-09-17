#include<iostream>
using namespace std;
void accept(int*, int);
void display(int*, int);
void minMax(int*, int);
void searchEle(int*, int,int);
void oddEven(int*, int, int&, int&);

int main()
{
    int oddCnt=0, evenCnt=0;
    int key;
    int size_arr;
    cout<<"Enter Number of Array elements.: ";
    cin>>size_arr;

    int * arr;
    arr = new int[size_arr];
    accept(arr, size_arr);
    display(arr, size_arr);
    minMax(arr, size_arr);

    cout<<"\nEnter Number to search from array: ";
    cin>>key;
    searchEle(arr,size_arr,key); 

    oddEven(arr, size_arr, oddCnt, evenCnt);
    cout<<"Odd elements count: "<<oddCnt;
    cout<<"\nEven elements count: "<<evenCnt;


    
  
    delete []arr;
    arr=NULL;

    return 0;
}

void accept(int* a, int size_arr)
{
    cout<<"----Enter Array elements----\n";
    for(int i=0; i<size_arr; i++)
    {
        cin>>a[i];
    }

}

void display(int* a, int size_arr)
{
    cout<<"Array Elements: \n";
    for(int i=0; i<size_arr; i++)
    {
        cout<<"|";
        cout<<a[i];
        cout<<"|  ";
    }
    cout<<"\n";
}

void minMax(int* a, int size_arr)
{
    int max=a[0];
    for(int i=0; i<size_arr; i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
    }

    int min=a[0];
    for(int i=0; i<size_arr; i++)
    {
        if(a[i]<min)
        {
            min=a[i];
        }
    }
    cout<<"Max: "<<max<<" ---- Min: "<<min;
}

void searchEle(int *a, int size_arr,int key)
{
    int flag=0;
    int index=0;
    for(int i=0; i<size_arr; i++)
    {
        if(a[i]==key)
        {
            flag=1;
            index=i;
        }
    }
    if(flag==1)
        cout<<"Item found at index"<<index<<"\n";
    else
        cout<<"Item found\n";
}
void oddEven(int *a, int size_arr, int &oddCnt, int &evenCnt)
{
    for(int i=0; i<size_arr; i++)
    {
        if(a[i]==0 || a[i]%2==0) //0 is even 
            evenCnt++;
        else 
            oddCnt++;
    }
}







































// Made with ❤️;