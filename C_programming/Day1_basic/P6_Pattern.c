#include<stdio.h>
int main()
{
    for(int i=1; i<=5; i++)
    {
        for(int j=5; j>i; j--)
        {
            printf(" ");
        }
        
        for(int j=1; j<=i; j++)
        {
            printf("%d",j);
        }

        for(int j=1; j<=i; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
}
//    11
//   1212
//  123123
// 12341234
//1234512345