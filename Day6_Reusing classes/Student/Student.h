#include"Cstring.h"
#include"Date.h"
class Student
{
    static int cnt;
    int r_no;
    Cstring name;
    Date b_date;
    Date a_date;
    public:
        Student();
        // Student(int, Cstring, Date, Date);
        Student(const char *, int,int,int, int,int,int);
        Student(Student &);
        ~Student();

        void setData(const char*, int,int,int, int,int,int);
        void display();

};
