public class Comparsion {
    public static void main(String[] args) {
        String a="Hello";
        String b="Hello";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        String a2=new String("Hello");
        String b2=new String("Hello");
        System.out.println(a2==b2);
        System.out.println(a2.equals(b2));
    }
}
