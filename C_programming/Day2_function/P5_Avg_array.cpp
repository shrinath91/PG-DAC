//find out average of all elements of array using function.
#include<stdio.h>
#include<string.h>

int average(int[], int);

int main()
{
    int arr[10];
    printf("Enter 10 Numbers: ");
    for(int i=0; i<10; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("\nElements in Array: ");
    for(int i=0; i<10; i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\nAverage of Elements Array: %d",average(arr,10));

    return 0;
}

int average(int a[], int size)
{   
    int avg,sum=0;
    for(int i=0; i<size; i++)
    {
        sum=sum+a[i];
    }
    printf("\nSum: %d",sum);
    avg=sum/size;
    return avg;
}