#include"A1.h"
int Account::cnt=0;

int main()
{
    Account a1;
    a1.display();

    Account a2("Shrinath",20000);
    a2.display();
    try{
        a2.withdraw(2000);
        a2.withdraw(3000);
        a2.withdraw(22000);
        // a2.deposit(5000);//upper line will throw exception so this line will not excuted, 
    }
    catch(AmmountExceededException *e1)
    {
        cout<<e1->what()<<endl;
    }
    catch(MinBalanceException *e1)
    {
        cout<<e1->what()<<endl;
    }
    a2.deposit(5000);
    a2.display();

    // Account a3("Hari",50000);
    // try{}
        
    


    return 0;
}