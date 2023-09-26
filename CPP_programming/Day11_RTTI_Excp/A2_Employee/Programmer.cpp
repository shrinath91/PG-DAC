#include"Employee.cpp"
class Programmer : public Employee
{
    public:
        Programmer()
        {

        }
        Programmer(const char *nm):Employee(nm)
        {
            
        }
        void test()
        {
            cout<<"Inside test() of Programmer\n";
        }
        void display()
        {
            Employee::display();
        }
        void Codding()
        {
            cout<<"Inside Codding() of Programmer\n";
        }
};