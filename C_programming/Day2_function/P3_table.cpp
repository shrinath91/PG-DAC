//Accept number from user and print it's multiplication table using function.
#include<stdio.h>
void table(int );

int main()
{
    int num;
    printf("Enter Number: \n");
    scanf("%d",&num);
    table(num);
    
    
    return 0;
}

void table(int num)
{
    for(int i=1; i<=10; i++)
    {
        printf("%d * %d = %d",num,i,num*i);
        printf("\n");
    }

}