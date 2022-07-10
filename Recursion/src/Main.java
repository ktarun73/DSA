public class Main {
    public static void main(String[] args) {
//        meassage(5);
        print1(1);
    }

    private static void print1(int i) {
        if(i==5) return;
        System.out.println(i);
        print1(i+1);

    }

    private static void meassage(int a) {
        if(a==0) return;
        System.out.println("Hello World");
        meassage(a-1);
    }
}
