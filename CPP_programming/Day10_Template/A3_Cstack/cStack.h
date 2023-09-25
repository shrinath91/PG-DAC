#include<iostream>
using namespace std;
template <class T>
class Cstack
{
    int size;
    int top;
    T *arr;
    public:
        T val;
        Cstack();
        Cstack(int);

        void push(T);
        T pop();
        void display();
};
