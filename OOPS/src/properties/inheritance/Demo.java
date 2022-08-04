package properties.inheritance;

class ABC {
    int value = 1000;
    ABC() {
        System.out.println("This is the base class constructor");
    }
}
class DEF extends ABC {
    int value = 10;
    DEF() {
        System.out.println("This is the inherited class constructor");
    }
}
public class Demo {
    public static void main(String[] args) {
        DEF obj = new DEF();
        System.out.println("In the main class, inherited class object has been created");
        System.out.println("Reference of inherited class type :" + obj.value);
        ABC my_obj = obj;
        System.out.println("In the main class, parent class object has been created");
        System.out.println("Reference of base class type : " + my_obj.value);
    }
}
