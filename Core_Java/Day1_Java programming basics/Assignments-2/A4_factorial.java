class A4_factorial
{
    public static void main(String args[])
    {
        int res=1,num=7;
        System.out.print("Factorial of"+num+":");
        for(int i=1; i<=num; i++)
        {
            System.out.print(i);
            res=res*i;
            if(num==i)
            {
                System.out.print(" = ");
                break;
            }
            System.out.print(" * ");
        }
        System.out.println(res);
    }
}