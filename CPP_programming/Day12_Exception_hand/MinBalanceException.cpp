#include<iostream>
#include<exception>
using namespace std;
class MinBalanceException:public exception
{
    public:
        const char* what()
        {
            return "Not Sufficient Balance";
        }
};