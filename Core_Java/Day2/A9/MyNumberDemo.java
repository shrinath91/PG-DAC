class MyNumberDemo
{
    public static void main(String []args)
    {
        MyNumber m1;
        m1=new MyNumber();
        m1.check();
        
        MyNumber m2;
        m2=new MyNumber(-1);
        m2.check();
        
        MyNumber m3;
        m3=new MyNumber(1);
        m3.check();
        
        MyNumber m4;
        m4=new MyNumber(2);
        m4.check();
    }
}