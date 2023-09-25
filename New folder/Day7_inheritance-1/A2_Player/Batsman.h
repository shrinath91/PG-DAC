#include"Player.h"

class Batsman:public Player
{
    int innings, notout, runs;
    public:
        Batsman();
        Batsman(const char*, int, int, int);
        Batsman(Batsman &);

        void display();
        bool calcAvg();
};