//Write a function which will return diffrence between max and min element of array
#include<stdio.h>
#include<string.h>

int diff_min_max(int[], int);

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
    
    printf("\nDifference between Max and Min Elements: %d",diff_min_max(arr,10));

    return 0;
}

int diff_min_max(int a[], int size)
{   
    int diff;
    int max = a[0];
    for(int i=1; i<size; i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
    }
    int min = a[0];
    for(int i=1; i<size; i++)
    {
        if(a[i]<min)
        {
            min=a[i];
        }
    }
    return max-min;
}