public class OddOrEven {
    public static void main(String[] args) {
        int a=21;
        System.out.println(isEven(a));
    }

    private static boolean isEven(int a) {
        return (a&1)==0;
    }
}
