package interfaces;

class Parent{
    void sample(){
        System.out.println("Inside Parent class");
    }
}
class Child extends Parent{
//    @Override we cannot use this because the method is not overridden
    void sample(int x){
        System.out.println("Inside child class as smaple(int)"+x);
    }
}
public class Annotations {
    public static void main(String[] args) {
        Child child=new Child();

    }
}
