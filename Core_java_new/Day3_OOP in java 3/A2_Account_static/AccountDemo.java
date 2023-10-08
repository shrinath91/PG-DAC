class AccountDemo
{
    public static void main(String []args)
    {
        Account a1;
        a1=new Account();
        a1.display();
        
        Account a2;
        a2=new Account(1,10000);
        a2.display();
        
        Account a3;
        a3=new Account(a2);
        Account.updateRate(8f);
        a3.display();

        // Account a4;
        // a4.display();

        
    }
}