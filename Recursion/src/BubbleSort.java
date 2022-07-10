import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar={};
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void bubbleSort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                if(ar[j]<ar[j-1]){
                    int temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }
            }
        }
    }

    private static void bS(int[] ar,int n){
        if(n==1) return;


    }
}
