// #include "lab5.h";
// // 3.1
// // int main () {
// //     Animal a;
// //     a.speak();
// //     Animal b("CAT", Blue);
// //     b.speak();
// //     cout << "Program exiting..." << endl;
// //     return 0;
// // }

// // 3.2
// // int main () {
// //     Dog d("Kevin", White, "Tale");
// //     d.speak();
// //     d.move();
// //     return 0;
// // }

// // 3.3
// // int main()
// // {
// //     Animal *animalPtr = new Dog("Lassie", White, "Andy");
// //     animalPtr->speak();
// //     animalPtr->move();
// //     delete (animalPtr);
// //     animalPtr = NULL;
// //     return 0;
// // }

// // 3.3 part3
// // int main()
// // {
// //     Dog dogi("Lassie", White, "Andy");
// //     Mammal *aniPtr = &dogi;
// //     Mammal &aniRef = dogi;
// //     Mammal aniVal = dogi;

// //     aniPtr->speak(); // by pointer, will follow dog
// //     aniRef.speak();  // by reference, will follow dog
// //     aniVal.speak();  // by value, will follow animal
// // }

// int main()
// {
//     int choice;

//     Mammal *mammals[3];
//     mammals[0] = new Dog("Kai", Brown, "Susan");
//     mammals[1] = new Cat("Bob", Blue, "Phoebe");
//     mammals[2] = new Lion("Ross", White, "Rachel");

//     while (1)
//     {
//         cout << "Select animal to send to Zoo: \n";
//         cout << "1. Dog\n";
//         cout << "2. Cat\n";
//         cout << "3. Lion\n";
//         cout << "4. All animals\n";
//         cout << "5. Quit\n";
//         cin >> choice;

//         switch (choice)
//         {
//         case 1:
//             mammals[0]->speak();
//             mammals[0]->move();
//             mammals[0]->eat();
//             break;
//         case 2:
//             mammals[1]->speak();
//             mammals[1]->move();
//             mammals[1]->eat();
//             break;
//         case 3:
//             mammals[2]->speak();
//             mammals[2]->move();
//             mammals[2]->eat();
//             break;
//         case 4:
//             for (int i = 0; i < 3; i++)
//             {
//                 mammals[i]->speak();
//                 mammals[i]->move();
//                 mammals[i]->eat();
//             }
//             break;
//         case 5:
//             cout << "Quitting program" << endl;
//             exit(1);

//         default:
//             break;
//         }
//     }
// }