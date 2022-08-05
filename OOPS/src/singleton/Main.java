package singleton;


public class Main {


    public static void main(String[] args) {
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();
        System.out.println(obj1.test);
        obj2.test++;
        obj3.test++;
        System.out.println(obj1.test);
        System.out.println(obj2.test);


    }

}
