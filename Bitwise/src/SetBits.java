public class SetBits {
    public static void main(String[] args) {
        int a=4;
        System.out.println(Integer.toBinaryString(a));
        int count=0;
        while(a>0){
            if((a&1)==1)count++;
            a=a>>1;
        }
        System.out.println(count);
    }
}
