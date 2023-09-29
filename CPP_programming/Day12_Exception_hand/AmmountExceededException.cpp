#include<iostream>
#include<exception>
using namespace std;
class AmmountExceededException:public exception
{
    public:
        const char* what()
        {
            return "Ammount Exceed";
        }
};