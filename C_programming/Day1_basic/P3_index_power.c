#include<stdio.h>
int main()
{
    int ind, bs;
    int res=1;
    printf("Enter base: ");
    scanf("%d",&bs);
    printf("Enter index: ");
    scanf("%d",&ind);
    
    for(int i=1; i<=ind; i++)
    {
        res = res * bs;
    }
    printf("%d raise to %d = %d",bs,ind,res);
}