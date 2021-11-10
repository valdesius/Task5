package valdes.inc.com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RhombusSizeException {
        System.out.println("Enter the size of the shape: ");
        int size = readNumber();
        handleException(size);
    }

    private static int readNumber() throws RhombusSizeException {
        String size = "";
        Scanner scanner = new Scanner(System.in);

        size = scanner.nextLine();
        int num = 0;

        try {
            num = Integer.parseInt(size);
        } catch (NumberFormatException e) {
            throw new RhombusSizeException("Type of entered value is not Integer", e);
        }
        return num;
    }

    private static boolean handleException(int size) {
        try {
            Rhombus rhombus = new Rhombus(size);
            rhombus.printShape(size);
            return true;
        } catch (RhombusSizeException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }
}





































