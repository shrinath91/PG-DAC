
#include"Employee.cpp"
#include"Programmer.cpp"
#include"DataBaseAdministrator.cpp"
#include"SystemAdministrator.cpp"

using namespace std;
int main()
{
    Employee *e1[5];
    e1[0]= new Employee("ABC");
    e1[1]= new Programmer("DEF");
    e1[2]= new DataBaseAdministrator("GHI");
    e1[3]= new SystemAdministrator("JKL");

    for(int i=0; i<4; i++)
    {
        // cout<<typeid(*e1[i]).name();
        const type_info &t1 = typeid(*e1[i]);
        cout<<t1.name()<<endl;
    }

    cout<<"\n\n\n";
    for(int i=0; i<4; i++)
    {
        Programmer *p = dynamic_cast <Programmer *>(e1[i]);
        if(p!=NULL)
        {
            p->Codding();
        }

        DataBaseAdministrator *da = dynamic_cast<DataBaseAdministrator *>(e1[i]);
        if(da!=NULL)
        {
            da->CreateDataBase();
        }

        SystemAdministrator *sa = dynamic_cast<SystemAdministrator *>(e1[i]);
        if(sa!=NULL)
        {
            sa->SystemUpdate();
            sa->display();
        }
        
    }





    return 0;
}