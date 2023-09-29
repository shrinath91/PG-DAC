#include <iostream>  
#include<string.h>  
using namespace std;  
int main() {
    int a = 42;
    int& ref_a = a;
    int *ptr= &ref_a;

    // This is not allowed; it will result in a compilation error.
    // foo(ref_a); // Error: cannot bind non-const lvalue reference to an lvalue
    return 0;
}