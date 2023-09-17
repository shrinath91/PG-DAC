#include<stdio.h>
int main()
{
    int num,i;
    printf("Enter Number: ");
    scanf("%d",&num);
    for(i=2; i<num; i++)
    {
        if(num%i==0)  
            break;
    }
    if(i==num)
        printf("Its Prime!!!");
    else 
        printf("Its not a Prime!!!");
        

}