#pragma once
#include"Cstring.h"

class Person
{
    Cstring name;
    int age;
    public: 
        Person();
        // Person(Cstring, int);
        Person(const char *, int);
        Person(Person &);
        void display();
};