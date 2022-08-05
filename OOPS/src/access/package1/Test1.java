package access.package1;

public class Test1 {
    int a;
    protected int b;
    protected void msg(){
        System.out.println("This is a protected method");
    }

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

