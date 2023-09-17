#include<stdio.h>
int main()
{
    int num,choice=1;

    do{
        printf("Enter Number: \n");
        scanf("%d",&num);
        for(int i=1; i<=10; i++)
        {
            printf("%d * %d = %d",num,i,num*i);
            printf("\n");
        }
        printf("Do you want to enter number: \n");
        printf("0.No\n1.Yes\n");
        scanf("%d",&choice);
    }while(choice>0);
    
    return 0;
}