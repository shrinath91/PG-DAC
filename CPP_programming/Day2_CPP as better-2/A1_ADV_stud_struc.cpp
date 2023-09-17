#include<iostream>
using namespace std;
typedef struct Student
{
    int roll;
    char name[20];
    int Sub_cnt;

    void accept()
    {
        cout<<"Enter roll no.: ";
        cin>>roll;

        cout<<"Enter Name.: ";
        cin>>name;

        cout<<"Enter Number";
        
    }
    void display()
    {
        cout<<"Roll Number: "<<roll<<"\n";
        cout<<"Name: "<<name<<"\n";
        // cout<<"Marks: "<<marks<<"\n";
    }

}Stud;
int main()
{
    
    return  0; 
}





















































































































// Made with ❤️;