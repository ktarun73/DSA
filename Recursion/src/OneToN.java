public class OneToN {
    public static void main(String[] args) {
        print(10);
    }

    private static void print(int i) {
        if(i==0) return;
        System.out.println(i);
        print(i-1);
    }

}
