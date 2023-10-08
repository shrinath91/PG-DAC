class A2_Divisor
{
    public static void main(String args[])
    {
        int i, num=24;
        System.out.print("Divisor: ");
        for(i=1; i<=num/2; i++)
        {
            if(num%i==0)
                System.out.print(i+", ");
        }
        System.out.print(i-1);
    }
}