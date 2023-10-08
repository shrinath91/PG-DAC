class MyMath
{
    // private int ni1;
    // private int ni2;
    // private int ni3;
    // private float nf1;
    // private float nf2;
    // private double nd1;/////no need 

    public MyMath()
    {}
    // public MyMath(int ni1, int ni2)
    // {
    //     this.ni1=ni1;
    //     this.ni2=ni2;   
    // }
    // public MyMath(int ni1, int ni2, int ni3)
    // {
    //     this.ni1=ni1;
    //     this.ni2=ni2;
    //     this.ni3=ni3;
    // }
    // public MyMath(float nf1, float nf2)
    // {
    //     this.nf1=nf1;
    //     this.nf2=nf2;
    // }
    // public MyMath(float nf1, double nd1)
    // {
    //     this.nf1=nf1;
    //     this.nd1=nd1;
    // }
    public int add(int ni1, int ni2)
    {
        System.out.println(ni1+"+"+ni2+": ");       
        return ni1+ni2;
    }
    public int add(int ni1, int ni2, int ni3)
    {
        System.out.println(ni1+"+"+ni2+"+"+ ni3+": ");
        return ni1+ni2+ni3;
    }
    public double add(float nf1, float nf2)
    {
        System.out.println(nf1+"+"+nf2+": ");
        return nf1+nf2;
    }
    public double add(float nf1, double nd1)
    {
        System.out.println(nf1+"+"+nd1+": ");        
        return nf1+nd1;
    }


}