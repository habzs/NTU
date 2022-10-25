#include <iostream>
#include <string>

using namespace std;

enum COLOR
{
    Green,
    Blue,
    White,
    Black,
    Brown
};

class Animal
{
private: // attributes
    string _name;
    COLOR _color;

public:
    Animal() : _name("unknown")
    {
        cout << "constructing Animal object" << _name << endl;
    }

    Animal(string n, COLOR c) : _name("unknown"), _color(White)
    {
        _name = n;
        _color = c;

        cout << "Animal() constructor called." << endl;
        cout << "Animal() name: " << _name << endl;
        cout << "-=-=-=-=-=-" << endl;
    }

    ~Animal()
    {
        cout << "destructing Animal object" << _name << endl;
    }
    virtual void speak()
    {
        cout << "Animal speaks" << endl;
    }

    virtual void move()
    {
        cout << "Mammal moves\n";
    }

    // setters and getters
    string getName()
    {
        return _name;
    }
};

class Mammal : public Animal
{
public:
    Mammal()
    {
        cout << "Default constructor";
    }

    Mammal(string n, COLOR c) : Animal(n, c)
    {
        cout << "constructing Mammal object: " << n << endl;
    };

    ~Mammal()
    {
        cout << "destructing Mammal object" << endl;
    }

    virtual void eat()
    {
        cout << "Mammal eats" << endl;
    }
};