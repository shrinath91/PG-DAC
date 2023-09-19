#include"Complex.h"

int main()
{
    int real, imag;
    Complex c1; //2,3 default val
    cout<<"Real: "<<c1.getReal()<<"\n";//non const objects can access const member function
    cout<<"Imag: "<<c1.getImag()<<"\n";//non const objects can access const member function
    c1.display();    

    Complex c2(5 ,4);
    c2.display();
    
    Complex c3;
   
    cout<<"********operator\"+\" overloading********";
    cout<<"\nc2 + c1\n";  
    c3=c1+c2;
    c3.display();
    
    cout<<"********operator \"-\" overloading********";  
    cout<<"\nc2 - c1\n";  
    c3=c2-c1;
    c3.display();
    
    cout<<"********operator \"*\" overloading********";    
    cout<<"\nc2 * c1\n";  
    c3=c1*c2;
    c3.display();

    cout<<"********operator \"Post Increment\" overloading********";   
    cout<<"\nC1 Before: ";
    c1.display();
    c3=c1++;
    cout<<"\nC1 After: ";    
    c1.display();
    cout<<"c3: ";
    c3.display();
    cout<<"\n";


    cout<<"********operator \"Pre Increment\" overloading********"; 
    cout<<"\nC2 Before: ";   
    c2.display();
    c3=++c2;
    cout<<"\nC2 After: ";   
    c2.display();
    cout<<"c3:";
    c3.display();
    cout<<"\n";
    
    //cout<<"Hello"<<endl;
    return 0;
}

//g++ -O .\A1_main.cpp .\Complex.cpp /////use this for compilation
// after using this command you will get .exe file 
// ./a.exe //// to execute excutable file














































