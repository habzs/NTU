import java.util.Scanner;

public class Strings {
    // read array of String objects, sort them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        String[] stringList;
        // Comparable[] stringList;

        System.out.println("How many Strings do you want to sort?");
        size = sc.nextInt();
        stringList = new String[size];
        // stringList = new Comparable[size];

        System.out.println("Enter the Strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = sc.next();
        }

        Sorting.insertionSort(stringList);
        System.out.println("Your String in sorted order...");

        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i] + " ");
        }

        System.out.println();

    }

}
