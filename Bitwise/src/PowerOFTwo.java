public class PowerOFTwo {
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(17));
    }

    private static boolean isPowerofTwo(int n) {
        return (n&(n-1))==0;
    }
}
