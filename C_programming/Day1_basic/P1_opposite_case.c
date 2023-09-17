#include<stdio.h>
int main()
{
    char ch;
    printf("Enter character: ");
    scanf("%c",&ch);

    if(ch>=65 && ch<=90)
    {
        printf("Your Opposite Char is: ");
        printf("%c",ch+32);
    }
    if(ch>=97 && ch<=122)
    {
        printf("Your Opposite Char is: ");
        printf("%c",ch-32);
    }
    else
     printf("Not valid\n");
     
     printf("%c\n",ch);
     printf("%d\n", ch);

}