import java.util.Arrays;

public class SumTriangle {

    public static void main(String[] args) {

        int[] ar={1,2,3,4,5};
        printTriangle(ar);

    }

    private static void printTriangle(int[] ar) {
        if(ar.length<1) return;
        int[] temp=new int[ar.length-1];
        for (int i = 0; i < ar.length-1; i++) {
            int x=ar[i]+ar[i+1];
            temp[i]=x;
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(ar));

    }
}
