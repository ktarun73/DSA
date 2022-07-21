public class MagicNumber {

    //WAP to find nth magic number

    public static void main(String[] args) {

        System.out.println(nthMagicNumber(5));

    }

    static int nthMagicNumber(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n & 1;
            n=n>>1;
            ans+=last*base;
            base*=5;
        }
        return ans;
    }
}
