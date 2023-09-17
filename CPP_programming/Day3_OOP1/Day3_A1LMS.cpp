#include<iostream>
using namespace std;

// class Employee
// {
//     private:
//         int employee_id;
//         char employee_name[20];
//         double salary;
//     public:
//         void accept()
//         {
//             cout<<"****Enter Data of Employee: ****\n";
//             cout<<"Enter Employee ID: ";    cin>> employee_id;
//             cout<<"Enter Employee Name: ";  cin>> employee_name;
//             cout<<"Enter Salary: ";         cin>> salary;
            
           
//         }
//         void display()
//         {
//             cout<<"****Data of Employee: ****\n";
//             cout<<"Employee Id: "<<employee_id<<endl;
//             cout<<"Employee Name: "<<employee_name<<endl;
//             cout<<"Salary: "<<salary<<endl;
//         }
        
        
// };

typedef struct Employee
{
    int employee_id;
    char employee_name[20];
    double salary;

    void accept()
    {
        cout<<"****Enter Data of Employee: ****\n";
        cout<<"Enter Employee ID: ";   
        cin>> employee_id;
        cout<<"Enter Employee Name: ";  
        cin>> employee_name;
        cout<<"Enter Salary: ";         
        cin>> salary;
        
        
    }
    void display()
    {
        cout<<"****Data of Employee: ****\n";
        cout<<"Employee Id: "<<employee_id<<endl;
        cout<<"Employee Name: "<<employee_name<<endl;
        cout<<"Salary: "<<std::fixed<<salary<<endl;/// here std::fixed is used to print as it is, without making it exponentiaL
    }

}EMP;

int main()
{
    EMP e1;
    e1.accept();
    e1.display();
    
    return  0; 
}



















































































// Made with ❤️;