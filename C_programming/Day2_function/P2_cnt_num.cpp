//Accpet number from user and Count number of digits using function.
#include<stdio.h>
#include<string.h>
int countDigit(int);

int main()
{
    int num, cnt;
    printf("Enter numer: ");
    scanf("%d",&num);
    cnt=countDigit(num);
    printf("Digits:%d",cnt);

    return 0;
}

int countDigit(int num)
{
    int count=0;
    while(num!=0)
    {
        num/=10;
        count++;
    }
    return count;
}