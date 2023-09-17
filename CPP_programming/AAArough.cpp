//made with ❤️;
#include <bits/stdc++.h>
using namespace std;

// class box
// {
// private:
//     int height, depth, width;
//     static int cnt;

// public:
//     box();
//     box(int, int);
//     box(int, int, int);
//     void display();
//     int volume();
//     int count();
//     int acceptValues();
// };

// int box ::cnt = 0;

// box::box()
// {
//     height = width = depth = 10;
//     cnt++;
// }

// box::box(int a, int b)
// {
//     width = height = a;
//     depth = b;
//     cnt++;
// }

// box::box(int h, int w, int d)
// {
//     height = h;
//     width = w;
//     depth = d;
//     cnt++;
// }

// void box ::display()
// {
//     cout << "The configuraton of the box is : " << height << " " << width << " " << depth << endl;
// }

// int box ::volume()
// {
//     return height * width * depth;
// }

// int box ::count()
// {
//     return cnt;
// }

// int box::acceptValues()
// {
//     cin >> height >> width >> depth;
// }

// int maxValue(int res, int size)
// {
//     int max = 0;
//     int arr[size];
//     for (int i = 0; i < size; i++)
//     {
//         arr[i] = res;
//     }

//     for (int i = 0; i < size; i++)
//     {
//         arr[i] = res;
//         if (arr[i] > max)
//         {
//             max = arr[i];
//         }
//     }
//     cout << max << endl;
//     return max;
// }

// // int maxValue(int, int);

// int main()
// {
//     int a, b, c, d, size;
//     cout << "Enter the size  : " << endl;
//     cin >> size;
//     box *bb;
//     // int *aa;
//     bb = new box[size];
//     // aa = new int[size];

//     for (int i = 0; i < size; i++)
//     {
//         cout << "Enter The Values Of " << i << " BOX : " << endl;
//         bb[i].acceptValues();
//     }

//     for (int i = 0; i < size; i++)
//     {
//         cout << "The Values Are : " << endl;
//         bb[i].display();
//     }
//     int res2;
//     for (int i = 0; i < size; i++)
//     {
//         cout << "The Volume Of " << i << " object is : " << endl;
//         res2 = bb[i].volume();
//         cout << res2 << endl;
//     }
    
//         maxValue(res2, size);
    
    

//     int res;
//     box b1;
//     b1.display();
//     res = b1.volume();
//     cout << res << endl;

//     box b2(12, 20);
//     b2.display();
//     res = b2.volume();
//     cout << res << endl;

//     box b3(12, 23, 34);
//     b3.display();
//     res = b3.volume();
//     cout << res << endl;

//     int cc = b1.count();

//     cout << cc;

//     return 0;
// // }
// int main()
// {
//     int no=1212;
//     int count=0;
//     if(no==0);
//         cout<<1;

//     while(no!=0)
//     {
//         no/=10;
//         if
//         count++;
//     }
//     cout<<count;
// }
