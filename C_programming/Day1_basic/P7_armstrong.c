    #include<stdio.h>
int main()
{
    int num,num1;
    int sum=0;
    printf("Enter a Number: ");
    scanf("%d",&num1);
    num = num1;
    while(num>0)
    {
        int a = num%10;
        num/=10;
        sum = sum + (a*a*a);
    }
    printf("%d\n",num1);
    if(num1==sum)
    {
        printf("Its a armstrong number!!!");
    }
    else
        printf("Its not a armstrong number!!!");

}