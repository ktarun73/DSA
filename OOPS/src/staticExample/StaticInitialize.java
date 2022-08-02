package staticExample;

public class StaticInitialize {
    static int a=4;
    static int b;
    static {
        System.out.println("Inside static block");
        b=a*5;
    }


    public static void main(String[] args) {
        System.out.println(StaticInitialize.a+" "+StaticInitialize.b);

    }



}


