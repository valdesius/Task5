package valdes.inc.com.company;

public class Rhombus {

    public Rhombus(int size) throws RhombusSizeException {
        if (size <= 1 || size % 2 == 0){
            System.err.println("Size of the rhombus must be more than 1 and be odd");
            throw new RhombusSizeException("Size is incorrect");
        }
    }

    void printShape(int size) {

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
