#include<iostream>
using namespace std;

class Box
{
    private:
        int height, width, depth;
    public:
        Box();
        Box(int ,int , int );

        void setData(int ,int , int );


        int calculate_Volume();/////////facilitators
        void display() const;

        bool operator<(Box &);
        bool operator>(Box &);
        bool operator==(Box &);
};

