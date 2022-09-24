import java.util.Scanner;

public class Strings {
    // read array of String objects, sort them
    public static void main(String[] args) {
        String[] stringList;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many strings do you want to sort?");
        size = sc.nextInt();

        stringList = new String[size];

        for (int i = 0; i <size ; i++) {
            stringList[i] = sc.nextLine();
        }
        Sorting.insertionSort(stringList);
        System.out.println("Your string in sorted order: ");

        for (int i= 0 ;i <size;i++) {
            System.out.println(stringList[i] + " ");
        }
    }

}



