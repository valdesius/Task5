package valdes.inc.com.company;

public class Rhombus {

    public void setSize(int size) throws RhombusSizeException {
        if (size <= 0 || size % 2 == 0) {
            throw new RhombusSizeException("Incorrect size");
        }
        printShape(size);
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
