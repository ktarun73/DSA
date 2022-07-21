public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=13;
        System.out.println("Before Swap a="+a+" and b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swap a="+a+" and b="+b);
    }
}
