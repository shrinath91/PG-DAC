#include"Employee.cpp"
class DataBaseAdministrator : public Employee
{
    public:
        DataBaseAdministrator()
        {

        }
        DataBaseAdministrator(const char *nm):Employee(nm)
        {

        }
        void test()
        {
            cout<<"Inside test() of DataBaseAdministrator\n";
        }
        void display()
        {
            Employee::display();
        }
        void CreateDataBase()
        {
            cout<<"Inside CreateDataBase() of DataBaseAdministrator\n";\
        }
};