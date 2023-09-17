//Find out either all elements in array is unique or not using function.
#include<stdio.h>
#include<string.h>

int unique(int[], int size);
int main()
{
    int res;
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
    res=unique(arr, 10);
    if(res==1)
        printf("\nAll elements are unique\n");
    else if(res==0)
        printf("\nAll elements are not unique\n");


    return 0;
}

int unique(int a[], int size)
{   
    int temp;
    for(int i=0; i<size; i++)
    {
        temp=a[i];
        for(int j=i+1; j<size; j++)
        {
            if(temp==a[j])
                return 0;
        }
    }
    return 1;
}