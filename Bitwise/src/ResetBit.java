public class ResetBit {
    public static void main(String[] args) {
        int a=5;
        resetIthBit(a,3);
    }

    static void resetIthBit(int a, int i){
        System.out.println(a&(~(1<<(i-1))));
    }
}
