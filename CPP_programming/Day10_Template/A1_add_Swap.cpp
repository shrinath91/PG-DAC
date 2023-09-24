#include<iostream>
using namespace std;

template <class M>
void display(M &a, M &b)
{
    cout<<"val 1: "<<a<<"\n";
    cout<<"Val 2: "<<b<<"\n";
}

template <class T>
void swap1(T &a, T &b)
{
    T temp;
    temp=a;
    a=b;
    b=temp;
}

template <class H>
void add(H &a, H &b)
{
    cout<<"Addition: "<<a+b<<"\n";
}

int main()
{
    int num1=1;
    int num2=2;
    float num3=1.5f;
    float num4=2.5f;
    char a='x';
    char b='y';

    display(num1, num2);  
    swap1(num1, num2);
    display(num1, num2); 
    add(num1, num2); 
    cout<<"#######################\n";
  
    display(num3, num4);  
    swap1(num3, num4);
    display(num3, num4);  
    add(num3, num4); 
    cout<<"#######################\n";

    display(a, b);  
    swap1(a, b);
    display(a, b);  
    add(a,b);
    cout<<"#######################\n";

    return 0;
}


//...swap(int, int)....//can be overriden but cant overload cuz there is already function available with same signature

// #include<iostream>
// using namespace std;
// class hello
// {
    
//     public:
//         void display(int &a, int &b)
//         {
//             cout<<"Num1: "<<a<<"\n";
//             cout<<"Num2: "<<b<<"\n";
//         }
//         template <class T>
//         void swap(T &a, T &b)
//         {
//             T temp;
//             temp=a;
//             a=b;
//             b=temp;
//         }
// };

// int main()
// {
//     int num1=1;
//     int num2=2;
//     hello h1;
//     h1.display(num1, num2);  
//     h1.swap(num1, num2);

//     return 0;
// }