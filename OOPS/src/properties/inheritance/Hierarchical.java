package properties.inheritance;

class A{

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    void printA(){
        System.out.println("Class A\n");
    }
}

class B extends A{
    void printB(){
        System.out.println("Class B\n");
    }

    void sum(int a,int b){
        super.setA(a);
        super.setB(b);
        System.out.println(a+b);
    }
}

class C extends A{
    void printC(){
        System.out.println("Class C\n");
    }
}

class D extends A{
    void printD(){
        System.out.println("Class D\n");
    }
}

public class Hierarchical {

    public static void main(String[] args) {
        B b=new B();
        b.printB();
        b.printA();

        C c=new C();
        c.printC();
        c.printA();

        D d=new D();
        d.printD();
        d.printA();

    }
}
