

int main() {
    Complex c1(2, 3);
    Complex c2;
    Complex c3;

    cout << "Initial Values:" << endl;
    c1.display();
    c2.display();

    // Use pre-increment operator (++obj)
    // c3=++c1;

    // Use post-increment operator (obj++)
    // c3 = c2++;

    cout << "After Increment:" << endl;
    c3= ++c1;
    c3.display();
    c3 = c2++;
    c3.display();


    // int a=2 , b=2 ,c;
    // c=a++;
    // cout<<c<<" "<<a<<endl; //2 3
    // c=++b;
    // cout<<c<<" "<<b; //3 3 
    return 0;
}
