#include<iostream>
using namespace std;

class Box
{
    private:
        int height, width, depth;
    public:
        int getHeight();///////getter
        int getWidth();
        int getDepth();

        int calculate_Volume();/////////facilitators
        void accept(); 
};

int Box::getHeight()//////////////////getter
{
    return height;
}
int Box::getWidth()
{
    return width;
}
int Box::getDepth()
{ 
    return depth;
}

int Box::calculate_Volume()/////////////////////facilitator
{
    return height*width*depth;
}
void Box::accept()
{
    cout<<"Enter height : ";
    cin>>height;
    cout<<"Enter width : ";
    cin>>width;
    cout<<"Enter depth : ";
    cin>>depth; 
}

int main()
{
    Box b1;

    b1.accept();
    int height=b1.getHeight();
    cout<<"Height: "<<height<<"\n";

    int width=b1.getWidth();
    cout<<"Width: "<<width<<"\n";

    int depth=b1.getDepth();
    cout<<"Depth: "<<depth<<"\n";

    int volume=b1.calculate_Volume();
    cout<<"Volume of cube: "<<volume;
    
    

}




































// Made with ❤️;