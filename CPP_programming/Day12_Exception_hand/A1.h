#pragma once
#include<iostream>
#include<Cstring>
#include"AmmountExceededException.cpp"
#include"MinBalanceException.cpp"
using namespace std;
class Account
{
    private:
        static int cnt;
        int acc;
        char name[10];
        double balance;
    public:
        Account();
        Account(const char*, double);
        void accept();
        void display();
        void deposit(double );
        void withdraw(double );

};
