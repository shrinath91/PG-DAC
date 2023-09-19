 #include <iostream>
using namespace std;
 
class Test
{
    int value;
 
 public:
    Test(int v = 1) //////////with this we can use dafult argument so that parameterized  and dafult 
    {               //////////constructor can be in one fuction only
        value = v; 
    }                   
       
    // const member function
    int getValue() const
    { 
        return value; 
    }
};
 
int main()
{
    // non const object
    Test t1(2);
    cout << t1.getValue();
    const Test t2(2);
    cout << t2.getValue();
    return 0;
}