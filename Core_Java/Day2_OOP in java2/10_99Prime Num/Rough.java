class Rough
{
    public static void main(String []args)
    {
        
        int count=0;
        System.out.println("Prime num:");
        
        for(int i=10; i<=99; i++)
        {
            int j;
            int c=0;
            for( j=2; j<i/2; j++)
            {
                if(i%j==0)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.print(i+", ");
                count++;
            }
        }
        System.out.println("Count: "+count);
    }
}