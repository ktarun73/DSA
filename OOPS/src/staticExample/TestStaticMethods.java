package staticExample;

public class TestStaticMethods {
    public static void main(String[] args) {
//        hello();
    }

    //we know that something is non-static belongs to an object
    void hello(){
        System.out.println("Hello");
        fun();
    }

    //this is not object dependent
    static void fun(){
//        hello();
        //you cannot use this because it requires an instance//
        //to access we need to instantiate the class
        TestStaticMethods obj=new TestStaticMethods();
        obj.hello();
    }
}
