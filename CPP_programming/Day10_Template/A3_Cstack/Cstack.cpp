#include"Cstack.h"


template <class T>
Cstack<T>::Cstack()
{
    size=5;
    top=-1;
    arr= new T[size];
}

template <class T>
Cstack<T>::Cstack(int s)
{
    size=s;
    top=-1;
    arr= new T[size];
}

template<class T>
void Cstack<T>::push(T n)
{
    top++;
    arr[top]=n;
}

template<class T>
T Cstack<T>::pop()
{
    T temp= arr[top];
    top--;
    return temp;
}

template <class T>
void Cstack<T>::display()
{
    for(int i=top; i>=0; i--)
    {
        cout<<arr[i]<<"\n";
    }
}
