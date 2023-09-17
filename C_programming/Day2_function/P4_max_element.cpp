 //Find out max element from array using function.
#include<stdio.h>
#include<string.h>

int maxNum(int[], int size);
int main()
{
    int max;
    int arr[10];
    printf("Enter 10 Numbers: ");
    for(int i=0; i<10; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Elements in Array: ");
    for(int i=0; i<10; i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n%d", maxNum(arr,10));

    return 0;
}

int maxNum(int a[], int size)
{   
    int max = a[0];
    for(int i=1; i<size; i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
    }
    return max;
}