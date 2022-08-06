package interfaces;
interface A{
    void show();
}

interface B {
    void show();
}
public class Main implements A, B {
    @Override
    public void show() {
        System.out.println("Method of interface");
    }

    public static void main(String[] args) {
        A a=new Main();
        a.show();

        B b=new Main();
        b.show();
    }
}
