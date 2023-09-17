#include<iostream>
using namespace std;
int cntChar(char *);
int cntSpace(char *);
int cntVowels(char *);
int main()
{
    int choice;
    char ch[40];
    cout<<"Enter string: ";
    scanf("%[^\n]s",ch); //using scanset
    //gets(ch);
    cout<<"String : "<<ch;
    do
    {
        cout<<"\n\nDo you want to continue: \n0.exit \n1.Count number of character \n2.Count number of spaces\n";
        cout<<"3.Count number of vowels\n";
        cout<<"\nPlease enter choice\n";
        cin>>choice;

        switch (choice)
        {
        case 0: 
            cout<<"Thank you !!!";
            break;
        case 1:      
            cout<<"Number of character: "<<cntChar(ch);
            break;
        case 2: 
            cout<<"Number of spaces: "<<cntSpace(ch);
            break;
        case 3:      
            cout<<"Number of vowels: "<<cntVowels(ch);
            break;
        
        default:
            cout<<"Invalid choice\n";
            break;
        }
        

    }while(choice!=0);
    

    return  0; 
}

int cntChar(char *a)
{
    int cnt=0;
    int i=0;
    while (a[i]!='\0')
    {
        cnt++;
        i++;
    }
    return cnt;
}

int cntSpace(char *a)
{
    int cnt=0;
    int i=0;
    while (a[i]!='\0')
    {
        if(a[i]==' ')
            cnt++;
        i++;
    }
    return cnt;
    
}

int cntVowels(char *a)
{
    int cnt=0;
    int i=0;
    while(a[i]!='0')
    {
        switch(a[i])
        {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                cnt++;
                break;
        }
    i++;
    }
    return cnt;
}



















































// Made with ❤️;