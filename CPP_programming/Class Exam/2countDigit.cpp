
#include <iostream>
using namespace std;
#include <stdlib.h>
int CountDigits(int);
int CountDigits(int n)
{
    int count=0; 
    if(n==0)
        return 1;
    while(n!=0)
    {
        count++;
        n/=10;
    }
    
    return count;
}
// program ends
int main(int argv, char *args[])
{
    int i, no, count;
    if (argv < 2)
    {
        cout << "Insufficient Arguments";
        return 1;
    }
    else
    {
        for (i = 1; 1 < argv; i++)
        {
            no = atoi(args[i]);
            count = CountDigits(no);
            cout << "Number of digits : " << count;
            cout << endl;
        }
    }
    return 0;
}
