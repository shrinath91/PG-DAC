class MyMathDemo
{
    public static void main(String []args)
    {
        MyMath m1;
        m1=new MyMath();
        System.out.println("Addition: "+ m1.add(2,3));
        System.out.println("Addition: "+ m1.add(2,3,4));
        System.out.println("Addition: "+ m1.add(2.5f,1.5f));
        System.out.println("Addition: "+ m1.add(2.5f,1.5));
    } 
}
