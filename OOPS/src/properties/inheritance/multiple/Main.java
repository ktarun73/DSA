package properties.inheritance.multiple;

class A{
    void show(){
        System.out.println("Class A ");
    }
}

class B{

}

//class C extends B{
//
//}
public class Main extends A {
    @Override
    void show() {
        super.show();
    }

    public static void main(String[] args) {
        new Main().show();
    }
}
