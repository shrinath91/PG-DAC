#include <iostream>
#include <cstring>
#include <iomanip>
using namespace std;

class Player
{
private:
    int player_id;
    char player_name[30];
    int runs;
    int wickets_taken;
    int innings_played;

public:
    Player();
    Player(int, char *, int, int, int);

    int getRun();
    int getWicket();
    int getId();

    void accept();
    void display();
};

int maxRun(Player *, int);
int maxwick(int);

Player::Player() ///////////////////////////constructor
{
    player_id = 0;
    strcpy(player_name, "NULL");
    runs = 0;
    wickets_taken = 0;
    innings_played = 0;
}
Player::Player(int id, char *ch, int run, int wic, int inn)
{
    player_id = id;
    strcpy(player_name, ch);
    runs = run;
    wickets_taken = wic;
    innings_played = inn;
}

int Player::getRun() ///////////////////////////getter
{
    return runs;
}
int Player::getWicket()
{
    return wickets_taken;
}

void Player::accept() /////////////////////////facilitator
{
    cout << "Player ID: ";
    cin >> player_id;

    cout << "Name: ";
    cin >> player_name;

    cout << "Runs: ";
    cin >> runs;

    cout << "Wicket Taken: ";
    cin >> wickets_taken;

    cout << "Innings played: ";
    cin >> innings_played;
}

void Player::display()
{
    // cout<<"Information of Player"<<
    cout << "Player ID: " << player_id << "\n";
    cout << "Name: " << player_name << "\n";
    cout << "Runs: " << runs << "\n";
    cout << "Wicket Taken: " << wickets_taken << "\n";
    cout << "Innings played: " << innings_played << "\n";
}

int maxRun(Player *a, int size)
{
    int i = 0;
    int maxRun = a[0].getRun();
    int maxIndex = 0;
    for (int i = 0; i < size; i++)
    {
        if (maxRun < a[i].getRun())
        {
            maxRun = a[i].getRun();
            maxIndex = i;
        }
    }
    return maxIndex;
}
int maxWick(Player *a, int size)
{
    int i = 0;
    int maxWic = a[0].getWicket();
    int maxIndex = 0;
    for (int i = 0; i < size; i++)
    {
        if (maxWic < a[i].getWicket())
        {
            maxWic = a[i].getWicket();
            maxIndex = i;
        }
    }
    return maxIndex;
}

int main()
{
    int max;
    int size = 3;
    Player c1[size];
    for (int i = 0; i < size; i++)
    {
        cout << "****Enter info for player " << (i + 1) << "****"<< "\n";
        c1[i].accept();
        cout << "\n\n";
    }
    for (int i = 0; i < size; i++)
    {
        cout << "****####Info for player" << (i + 1) << "####****"
             << "\n";
        c1[i].display();
    }

    max = maxRun(c1, size);
    cout << "\n****Max runs made by player: ****\n";
    c1[max].display();

    max = maxWick(c1, size);
    cout << "\n****Max Wickets taken by player: ****\n";
    c1[max].display();

    return 0;
}

























































// Made with ❤️;