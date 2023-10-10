class ReverseArraySorting
{
    public static void main(String []args)
    {
        int []arr = {1,9,2,3,6,5,4,7};

        sort(arr);
        display(arr);


    }

    public static void sort(int []arr)
    {
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                   temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
                }
            }
           
        }
    }
    public static void display(int []arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

}