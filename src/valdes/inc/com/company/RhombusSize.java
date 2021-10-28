package valdes.inc.com.company;

public class RhombusSize {
    public void getSize(int size){
        Rhombus rhombus = new Rhombus();

        try {
            rhombus.setSize(size);
        }
        catch (RhombusSizeException e) {
            System.out.println(e.getMessage());
        }
    }
}
