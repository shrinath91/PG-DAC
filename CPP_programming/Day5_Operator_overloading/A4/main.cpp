#include"Complex.cpp"
#include"Complex.h"
int main()
{
    Complex c1; //2,3 default val
    cout<<"Real: "<<c1.getReal()<<"\n";//non const objects can access const member function
    cout<<"Imag: "<<c1.getImag()<<"\n";//non const objects can access const member function
    c1.display();    

    Complex c2(5 ,4);
    c2.display();
    
    
    
    
    return 0;
}

//g++ -O .\A1_main.cpp .\Complex.cpp /////use this for compilation
// after using this command you will get .exe file 
// ./a.exe //// to execute excutable file















































