// 1. Create structure of Student having following attributes
//    1. Roll number
//    2. name of student
//    3. totalmarks of student.
//  Accept and Display 5 Student 
// Display stud haing maximum mark.

#include<iostream>
using namespace std;
typedef struct Student
{
    int roll;
    char name[20];
    int marks;
    void accept()
    {
        cout<<"Enter roll no.: ";
        cin>>roll;

        cout<<"Enter Name.: ";
        cin>>name;

        cout<<"Enter Marks.: ";
        cin>>marks;

    }
    void display()
    {
        cout<<"Roll Number: "<<roll<<"\n";
        cout<<"Name: "<<name<<"\n";
        cout<<"Marks: "<<marks<<"\n";
    }

}Stud;

Stud maxStudMarks(Stud[], int);

int main()////////////////////////////////main
{
    int size=5;
    Stud s1[size];
    cout<<"----Enter Students data----\n";
    for(int i=0; i<size; i++)
    {
        s1[i].accept();
    }

    cout<<"Students data.: \n";
    for(int i=0; i<size; i++)
    {
        s1[i].display();
        cout<<"----------------------------------\n";
    }
    Stud temp = maxStudMarks(s1,size);
    cout<<"\n****Rank 1 Student details.:****\n";
    temp.display();
    
}

Stud maxStudMarks(Stud a[], int size)
{
    int max=a[0].marks;
    int index;
    for(int i=0; i<size; i++)
    {
        if(a[i].marks > max)
        {
            max=a[i].marks;
            index=i;
        }
    }
    return a[index] ;
}












































































// Made with ❤️;
