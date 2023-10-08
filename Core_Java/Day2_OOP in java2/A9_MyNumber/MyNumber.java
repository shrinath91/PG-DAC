class MyNumber
{
    private int n;

    public MyNumber()/////////////
    {}
    public MyNumber(int n)
    {
        this.n=n;
    }

    public void isNeg()////////////////
    {
        if(n<0)
            System.out.println("Negative");
        else
            System.out.println("Not Negative");	
    }
    public void isPos()
    {
        if(n>0)
            System.out.println("Positive");
        else
            System.out.println("Not Positive");
    }
    public void isZero()
    {
        if(n==0)
            System.out.println("Zero");
        else
            System.out.println("Not zero");
        }
    public void isOdd()
    {
        if(n%2==0)
            System.out.println("Not Odd");
        else
            System.out.println("Odd");
    }
    public void isEven()
    {
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Not Even");
    }
    public void check()
    {
        System.out.println('\t'+"#####Check#####");
        System.out.println("Num: "+ n);

        System.out.print('\t'+"isNeg: "); isNeg();
        System.out.print('\t'+"isPos: "); isPos();
        System.out.print('\t'+"isZero: "); isZero();
        System.out.print('\t'+"isOdd: "); isOdd();
        System.out.print('\t'+"isEven: "); isEven();
        System.out.println();
        System.out.println();
    }
    


}