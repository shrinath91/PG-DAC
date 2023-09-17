#include<iostream>
using namespace std;
int strlength(char*);

int main()
{
    int cnt;
    char ch[40]="Bjarne Stroustrup";
    cout<<ch;
    cnt=strlength(ch);
    cout<<"Lenght of string: "<<cnt;

    return 0;
}

int strlength(char *a)
{
    int i=0, cout=0;
    while(a[i]!='\0')
    {
        cout++;
        i++;
    } 
    return cout;
}










































































// Made with ❤️;









































































// Made with ❤️;