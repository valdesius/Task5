package valdes.inc.com.company;

public class Rhombus {
    private int size;

    public Rhombus(int s) throws RhombusSizeException {
        size = s;
        if (s <= 0 || s % 2 == 0) {
            throw new RhombusSizeException("Incorrect size! The size of the rhombus must be greater than 1 and the size should be odd");
        }
    }

    public void printShape(int size) {
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
