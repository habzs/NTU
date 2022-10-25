#include "childAnimal.h"

int main()
{
    int choice;

    Mammal *mammals[3];
    mammals[0] = new Dog("Kai", Brown, "Susan");
    mammals[1] = new Cat("Bob", Blue, "Phoebe");
    mammals[2] = new Lion("Ross", White, "Rachel");

    while (1)
    {
        cout << "Select animal to send to Zoo: \n";
        cout << "1. Dog\n";
        cout << "2. Cat\n";
        cout << "3. Lion\n";
        cout << "4. All animals\n";
        cout << "5. Quit\n";
        cin >> choice;

        switch (choice)
        {
        case 1:
            mammals[0]->speak();
            mammals[0]->move();
            mammals[0]->eat();
            break;
        case 2:
            mammals[1]->speak();
            mammals[1]->move();
            mammals[1]->eat();
            break;
        case 3:
            mammals[2]->speak();
            mammals[2]->move();
            mammals[2]->eat();
            break;
        case 4:
            for (int i = 0; i < 3; i++)
            {
                mammals[i]->speak();
                mammals[i]->move();
                mammals[i]->eat();
            }
            break;
        case 5:
            cout << "Quitting program" << endl;
            exit(1);

        default:
            break;
        }
    }
}