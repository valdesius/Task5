package valdes.inc.com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of the shape: ");
        int size = readNumber();

        try {
            Rhombus rhombus = new Rhombus(size);
            rhombus.printShape(size);
        } catch (RhombusSizeException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int readNumber()  {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();

        return size;
    }

}





































