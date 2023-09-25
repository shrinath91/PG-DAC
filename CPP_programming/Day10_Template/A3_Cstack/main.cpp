#include"Cstack.cpp"
int main()
{
    Cstack <char>c1;
    int choice;
    
    do{
        cout<<"Enter choice: \n";
        cout<<"1.Push\n";
        cout<<"2.POP\n";
        cout<<"3.Display Stack\n";
        cin>>choice;
        switch(choice)
        {
            case 1:
                cout<<"Enter a value to push: ";
                cin>>c1.val;
                c1.push(c1.val);
                break;
            case 2:
                cout<<"Popped element: "<<c1.pop();
                break;
            case 3:
                cout<<"####Stack####\n";
                c1.display();
                break;
        }
    }while(choice!=0);
       
    return 0;
}