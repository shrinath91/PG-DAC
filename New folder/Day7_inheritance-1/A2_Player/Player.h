#include"Cstring.h"
#include<iostream>

class Player
{
    static int cnt;
    int p_id;
    Cstring name;
    public:
        Player();
        Player(const char*);
        Player(Player &);

        void display();

};


// 2. Define class Player with following specification
// Player id integer
// player name char
// Define a class batsman with the following specifications:
// Private members:
//     innings, notout, runs integer type
// Public members:
//     readdata() calcavg() Function to compute batavg. 
//     it is calculated according to the formula -batavg =runs/(innings-notout)
// Function to accept value from bode, name, innings, notout and invoke the function
// Function to display the data members on the screen. displaydata()
