package properties.polymrphism;

public class Circle extends Shapes{
    @Override //annotation
    void area() {
        System.out.println("Area is Pi * r * r");
    }
}
