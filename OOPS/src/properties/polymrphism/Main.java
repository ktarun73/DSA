package properties.polymrphism;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Shapes circle=new Circle();
        Square square=new Square();

        circle.area();
        shape.area();
        square.area();

    }
}
