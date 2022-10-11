package SC2002.question2;

import java.util.Scanner;

public class Shape2DApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int noOfShapes, choice, tempRad, tempWidth, tempHeight;
        double totalArea = 0;
        // need an array of shapes to store the.. shapes.
        Shape userShapes[];

        System.out.printf("Enter total number of shapes: ");
        noOfShapes = sc.nextInt();
        userShapes = new Shape[noOfShapes];

        for (int i = 0; i < noOfShapes; i++) {
            int j = i + 1;
            System.out.println("Choose shape: " + j);
            System.out.println("1: Circle");
            System.out.println("2: Rectangle");
            System.out.println("3: Square");
            System.out.println("4: Triangle");
            System.out.printf("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // circle
                    System.out.printf("\nEnter Circle Radius: ");
                    tempRad = sc.nextInt();

                    // create new Circle object and store it in the Shapes array.
                    // same as Shapes upcastCircle = new Circle;
                    // any methods called to upcastCircle will call Circle's method, because it's
                    // implements
                    userShapes[i] = new Circle(tempRad);
                    break;
                case 2:
                    System.out.printf("\nEnter Rectangle Width: ");
                    tempWidth = sc.nextInt();
                    System.out.printf("\nEnter Rectangle Height: ");
                    tempHeight = sc.nextInt();

                    userShapes[i] = new Rectangle(tempWidth, tempHeight);
                    break;
                case 3:
                    System.out.printf("\nEnter Square length: ");
                    tempRad = sc.nextInt();

                    userShapes[i] = new Square(tempRad);
                    break;
                case 4:
                    System.out.printf("\nEnter Triangle base: ");
                    tempWidth = sc.nextInt();
                    System.out.printf("\nEnter Triangle height: ");
                    tempHeight = sc.nextInt();

                    userShapes[i] = new Triangle(tempWidth, tempHeight);
                    break;
            }
        }

        while (loop) {
            System.out.println("--==--==--==--");
            System.out.println("1. Calculate Area");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                for (int i = 0; i < noOfShapes; i++) {
                    totalArea += userShapes[i].area();
                }

                System.out.println("Total area is: " + totalArea);
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}