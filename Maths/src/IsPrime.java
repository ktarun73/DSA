public class IsPrime {
    public static void main(String[] args) {
        int a=37;
        System.out.println(isPrime(a));
    }

    private static boolean isPrime(int i) {
        if(i<=1) return false;
        int c=2;
        while((c*c)<=i){
            if(i%c==0) return false;
            c++;
        }

        return true;
    }
}
