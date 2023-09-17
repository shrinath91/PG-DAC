// 1. Create structure of Student having following attributes
//    1. Roll number
//    2. name of student
//    3. totalmarks of student.
//  Accept and Display  Students dynamically 
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

int main()
{
    int no_stud;
    cout<<"Enter Number of Student.:\n";
    cin>>no_stud;

    Stud *s1;
    s1=new Stud[no_stud];
    cout<<"----Enter Students data----\n";
    for(int i=0; i<no_stud; i++)
    {
        s1[i].accept();
    }

    cout<<"Students data.: \n";
    for(int i=0; i<no_stud; i++)
    {
        s1[i].display();
        cout<<"----------------------------------\n";
    }
    Stud temp = maxStudMarks(s1,no_stud);
    cout<<"\n****Rank 1 Student details.:****\n";
    temp.display();
    delete []s1;
    s1=NULL;
    
}

Stud maxStudMarks(Stud a[], int no_stud)
{
    int max=a[0].marks;
    int index;
    for(int i=0; i<no_stud; i++)
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