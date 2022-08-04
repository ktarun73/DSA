package properties.inheritance.multilevel;

class A{
    int a;
    int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add(){
        System.out.println(a+b);
    }
}

class B extends A{
    public B(int a, int b) {
        super(a, b);
    }

    void sub(){
        System.out.println(a-b);
    }


}

class C extends B{
    public C(int a, int b) {
        super(a, b);
    }

    @Override
    void sub() {
        System.out.println(b-a);
    }

}


public class Main {
    public static void main(String[] args) {
        C c=new C(1,2);
        c.add();
        c.sub();
    }

}
