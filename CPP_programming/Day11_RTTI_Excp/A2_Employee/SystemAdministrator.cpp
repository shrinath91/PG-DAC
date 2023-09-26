#include"Employee.cpp"
class SystemAdministrator : public Employee
{
    public:
        SystemAdministrator()
        {

        }
        SystemAdministrator(const char *nm):Employee(nm)
        {

        }
        void test()
        {
            cout<<"Inside test() of SystemAdministrator\n";
        }
        void display()
        {
            Employee::display();
        }
        void SystemUpdate()
        {
            cout<<"Inside SystemUpdate() of SystemAdministrator\n";
        }
};