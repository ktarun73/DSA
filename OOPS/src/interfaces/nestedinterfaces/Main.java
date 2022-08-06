package interfaces.nestedinterfaces;

//interface A{
//    interface B{
//
//    }
//}
public class Main {
    public interface A{
        boolean isOdd(int x);
    }

     interface nested{
        static void fun(){
            System.out.println("In");
        }
    }

    public static void main(String[] args) {
        A a=new B();
        System.out.println(a.isOdd(233));
        nested.fun();
    }

}

class B implements Main.A{

    @Override
    public boolean isOdd(int x) {
        return (x&1)==1;
    }
}
