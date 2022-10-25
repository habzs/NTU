#include "animal.h"

#include <iostream>
#include <string>

using namespace std;

// 3.2.2

class Dog : public Mammal
{
private:
    string _owner;

public:
    Dog(string name, COLOR color, string OWNER) : Mammal(name, color)
    {
        _owner = OWNER;

        cout << "--dog constructed--" << endl;
        cout << "dog name: " << name << endl;
        cout << "dog color: " << color << endl;
        cout << "dog owner: " << _owner << endl;
    }

    ~Dog()
    {
        cout << "dog DECONSTRUCTED\n";
    }

    void speak() // overrides speak() function from Animal class
    {
        cout << "woof!" << endl;
    }

    void move()
    {
        cout << "dog: "
             << "moved!" << endl;
    }

    void eat()
    {
        cout << Animal::getName() << " is eating!\n";
    }
};

class Cat : public Mammal
{
private:
    string _owner;

public:
    Cat(string n, COLOR c, string owner) : Mammal(n, c)
    {
        _owner = owner;
    }

    ~Cat()
    {
        cout << "cat is destroyed\n";
    }

    void speak()
    {
        cout << Animal::getName() << " goes meow\n";
    }

    void move()
    {
        cout << Animal::getName() << " pounces\n";
    }

    void eat()
    {
        cout << Animal::getName() << " eats\n";
    }
};

class Lion : public Mammal
{
private:
    string _owner;

public:
    Lion(string n, COLOR c, string owner) : Mammal(n, c)
    {
        _owner = owner;
    }

    ~Lion()
    {
        cout << "lion destroyed\n";
    }

    void speak()
    {
        cout << Animal::getName() << " roars.\n";
    }

    void move()
    {
        cout << Animal::getName() << " waddles.\n";
    }

    void eat()
    {
        cout << Animal::getName() << " eats.\n";
    }
};
