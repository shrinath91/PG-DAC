#include"Batsman.h"
Batsman::Batsman()
{
    innings=0;
    notout=0;
    runs=0;
}
Batsman::Batsman(const char *nm, int innings, int notout, int runs):Player(nm)
{
    this->innings=innings;
    this->notout=notout;
    this->runs=runs;
}
Batsman::Batsman(Batsman &obj):Player(obj)
{
    this->innings = obj.innings;
    this->notout = obj.notout;
    this->runs =  obj.runs;
}

void Batsman::display()///////////////////facilitator
{
    Player::display();
    cout<<"**Innings: "<<innings<<"\n";
    cout<<"**Not Out: "<<notout<<"\n";
    cout<<"**Runs: "<<runs<<"\n";
}
bool Batsman::calcAvg()
{
    if((innings-notout)>0)
       return runs/(innings-notout);
    else
        return 0;
}
