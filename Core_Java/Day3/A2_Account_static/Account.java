class Account
{
    private int accno;
    private double balance;
    private static float in_rate;
    
    static
    {
        in_rate=8.4f;
    }

    public Account()
    {}
    public Account(int accno, double balance)
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
        System.out.println("Balance: "+ calBalance());
    }

    public double calBalance()
    {
        return balance+(balance*in_rate/100);
    }

    public static void updateRate(float new_rate)
    { 
        in_rate=new_rate;
    }

}