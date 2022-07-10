public class Fibonacci {
    public static void main(String[] args) {
        int n=fib(50);
        System.out.println(n);
    }

    private static int fib(int n) {
        if(n<2) return n;
        return fib(n-1)+fib(n-2);

    }

}
