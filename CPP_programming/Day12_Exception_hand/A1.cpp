#include"A1.h"

Account::Account()
{
    acc=++cnt;
    strcpy(name,"NA");
    balance=0;
}
Account::Account(const char *nm, double b)
{
    acc=++cnt;
    strcpy(name,nm);
    balance=b;
}
void Account::accept()
{
    cout<<"Enter Name: ";
    cin>>name;
    cout<<"Enter balance: ";
    cin>>balance;
}
void Account::display()
{
    cout<<"##############################\n";
    cout<<"\t\tAcc: "<<acc<<"\n";
    cout<<"\t\tName: "<<name<<"\n";
    cout<<"\t\tBalance: "<<balance<<"\n\n\n";
}
void Account::deposit(double amt)
{
    balance=balance+amt;
}
void Account::withdraw(double amt)
{
    if(amt>=50000 )
    {
        throw new AmmountExceededException();
    }
    else if(amt>this->balance)
    {
        throw new MinBalanceException();
    }
    else 
    {
        balance=balance-amt;
        cout<<"Withdraw Successful!\n";
    }
}