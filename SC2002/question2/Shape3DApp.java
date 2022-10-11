package SC2002.question2;

import java.util.Scanner;

public class Shape3DApp {

    public static void main(String[] args) {
        int noOfShape, choice1, choice2, x, y, z;
        double totalarea = 0.0;
        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            System.out.println("Please enter the total number of shapes");
            noOfShape = sc.nextInt();
            Shape[] shapes = new Shape[noOfShape];

            for (int i = 0; i < noOfShape; i++) {
                System.out.println("Please choose the shape");
                System.out.println("1. Sphere");
                System.out.println("2. Square-based Pyramid");
                System.out.println("3. Cuboid");
                System.out.println("4. Cone");
                System.out.println("5. Cylinder");
                System.out.println("6. Exit");
                choice1 = sc.nextInt();

                switch (choice1) {
                    case 1:
                        System.out.println("Please enter the radius");
                        x = sc.nextInt();
                        shapes[i] = new Sphere(x);
                        break;
                    case 2:
                        System.out.println("Please enter the length");
                        x = sc.nextInt();
                        System.out.println("Please enter the breadth");
                        y = sc.nextInt();
                        shapes[i] = new Pyramid(x, y);
                        break;
                    case 3:
                        System.out.println("Please enter the length");
                        x = sc.nextInt();
                        System.out.println("Please enter the breadth");
                        y = sc.nextInt();
                        System.out.println("Please enter the height");
                        z = sc.nextInt();
                        shapes[i] = new Cuboid(x, y, z);
                        break;
                    case 4:
                        System.out.println("Please enter the radius");
                        x = sc.nextInt();
                        System.out.println("Please enter the height");
                        y = sc.nextInt();
                        shapes[i] = new Cone(x, y);
                        break;
                    case 5:
                        System.out.println("Please enter the height");
                        x = sc.nextInt();
                        System.out.println("Please enter the radius");
                        y = sc.nextInt();
                        shapes[i] = new Cylinder(x, y);
                        break;
                    case 6:
                    default:
                        System.out.println("Exiting...");
                        loop = false;
                        break;

                }
            }

            if (loop == true) {
                System.out.println("Enter 1 to calculate or 2 to exit");
                choice2 = sc.nextInt();
                if (choice2 == 1) {
                    for (int j = 0; j < shapes.length; j++) {
                        totalarea = totalarea + shapes[j].area();
                    }
                    System.out.println("Total area is " + totalarea);
                } else
                    System.out.println("Exiting...");
            }
        }

    }
}