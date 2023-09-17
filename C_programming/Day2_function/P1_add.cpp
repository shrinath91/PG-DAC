#include<stdio.h>
int add(int, int);

int main()
{
    int a, b;
    int res;
    printf("Enter 2 values: ");
    scanf("%d%d",&a,&b);
    res = add(a,b);
    printf("%d",res);
}

int add(int a, int b)
{
    return a+b;
}