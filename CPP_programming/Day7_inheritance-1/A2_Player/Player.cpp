#include"Player.h"

int Player::cnt=0;

Player::Player()
{
    cnt++;
    p_id=cnt;
}
Player::Player(const char* nm):name(nm)
{
    cnt++;
    p_id=cnt;
    // strcpy(name,nm);//error
    // Cstring(nm);// this can be possible nut using mem initializer list we can save one call to default constructor of Cstring class

}
Player::Player(Player &obj) : name(obj.name)
{
    cnt++;
    p_id=cnt;
}
void Player::display()//////////////////////////////////facilitator
{
    cout<<"Player ID: "<<p_id<<"\n";
    name.display();
}
