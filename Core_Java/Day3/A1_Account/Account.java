class Account
{
    private int accno;
    private int balance;

    public Account()
    {}
    public Account(int accno, int balance)
    {
        this.accno=accno;
        this.balance=balance;
    }
    public Account(Account a)
    {
        this.accno=a.accno;
        this.balance=a.balance;   
    }

    public void display()
    {
        System.out.println("Acc: "+ accno);
        System.out.println("Balance: "+ balance);
    }

}