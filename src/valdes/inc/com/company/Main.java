package valdes.inc.com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the size of the shape: ");
        int size = readSizeOfTheShape();
        printShape(size);

    }

    private static int readSizeOfTheShape() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        return size;
    }

    private static void printShape(int size) {
        for (int i = 1; i < size / 2; ++i) {

            for (int j = size / 2; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
        for (int i = size / 2; i >= 1; --i) {

            for (int j = size / 2; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < i * 2; ++j)
                System.out.print("*");

            System.out.println();
        }
    }
}




































