package valdes.inc.com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of the shape: ");

        RhombusSize rhombusSize = new RhombusSize();
        int size = readNumber();
        rhombusSize.getSize(size);
    }

    public static int readNumber()  {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();

        return size;
    }

}




































