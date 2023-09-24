#include<iostream>
// #include<climits>
using namespace std;

void top3Elements(int *arr, int size, int &max1, int &max2, int &max3)
{
    int i;
    // for(i=0;i<size;i++)
    // { 
    //     if(arr[i]>max1)  
    //     {
    //         max3=max2;
    //         max2=max1;
    //         max1=arr[i];
    //     }
    //     else if(arr[i]>max2)
    //     {
    //         max3=max2;
    //         max2=arr[i];
    //     }
    //     else if(arr[i]>max3)
    //     {
    //         max3=arr[i];
    //     }
    // }
    
    for (int i = 0; i < 8; i++)
    {
        if (arr[i] > max1)
        {
            max3 = max2;
            max2 = max1;
            max1 = arr[i];
        }
        else if (arr[i] > max2 && arr[i] != max1)
        {
            max3 = max2;
            max2 = arr[i];
        }
        else if (arr[i] > max3 && arr[i] != max1 && arr[i] != max2)
        {
            max3 = arr[i];
        }
    }
}

int main()
{
    int max1, max2, max3; 
    int arr[8];
    // max1 = max2 =max3 = -2147483648;//////ramge of int is **-2147483648 to 2147483647
    max1 = max2 = max3 = INT_MIN; //here i used  INT_MIN is a predefined constant in C++ (or C) that represents the minimum possible value that can be stored in a signed integer data type (int). 
    
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
    
    top3Elements(arr,8,max1 ,max2, max3);
    printf("\ntop element 1:%d\n",max1);
    printf("top element 2:%d\n",max2);
    printf("top element 3:%d\n",max3);
    

    return  0; 
}



























































// Made with ❤️;