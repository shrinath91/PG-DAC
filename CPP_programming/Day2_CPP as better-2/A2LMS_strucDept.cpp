// 1. Create structure of Student having following attributes
//    1. d_id number
//    2. d_name of student
//  Accept and Display dynamically 


#include<iostream>
using namespace std;
typedef struct Department
{
    int d_id;
    char d_name[20];
    void accept()
    {
        cout<<"Enter Department Id.: ";
        cin>>d_id;

        cout<<"Enter Department Name.: ";
        cin>>d_name;

    }
    void display()
    {
        cout<<"d_id Number: "<<d_id<<"\n";
        cout<<"d_name: "<<d_name<<"\n";
    }

}Dept;

int main()
{
    int no_stud;
    cout<<"Enter Number of Departments to store.:\n";
    cin>>no_stud;

    Dept *s1;
    s1=new Dept[no_stud];
    cout<<"----Enter Data----\n";
    for(int i=0; i<no_stud; i++)
    {
        cout<<"----Enter info about Department "<<(i+1)<<endl;
        s1[i].accept();
    }

    cout<<"\n****All Departments data.:****\n";
    for(int i=0; i<no_stud; i++)
    {
        s1[i].display();
        cout<<"----------------------------------\n";
    }

    delete []s1;
    s1=NULL;
    
}












































// Made with ❤️;