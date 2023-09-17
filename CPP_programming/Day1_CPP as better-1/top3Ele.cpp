#include<iostream>
using namespace std;

void top3Elements(int arr[], int size, int &max1, int &max2, int &max3)
{
    int i;
    for(i=0;i<size;i++)
    { 
        if(arr[i]>max1)  
        {
            max3=max2;
            max2=max1;
            max1=arr[i];
        }
    }
}
int main()
{
    int arr[8];
    printf("Enter 8 elements: \n");
    for(int i=0; i<8; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("8 elements: \n");
    for(int i=0; i<8; i++)
    {
        printf("%d ",arr[i]);
    }
    int max1 = -2147483648;
    int max2 = arr[0];
    int max3 = 2147483647 ;
    top3Elements(arr,8,max1 ,max2, max2);
    printf("top element:%d\n",max1);
    printf("top element:%d\n",max1);
    printf("top element:%d\n",max1);
    

    return  0; 
}



























































// Made with ❤️;