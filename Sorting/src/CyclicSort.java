import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] ar={3,5,2,1,4};
//        cyclicSort(ar);
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void sort(int[] ar) {
        int i=0;
        while (i<ar.length){
            int correct=ar[i]-1;
            if(ar[i] != ar[correct]){
                swap(ar,i,correct);
            }
            else {
                i++;
            }
        }
    }

    private static void cyclicSort(int[] ar) {
        int n=ar.length;
        for (int i = 0; i < n; i++) {
            if(ar[i]!=i+1){
                while (ar[i]!=i+1){
                    swap(ar, i, ar[i] - 1);
                }
            }
        }
    }

    private static void swap(int[] ar, int i, int j) {
        int temp=ar[j];
        ar[j]=ar[i];
        ar[i]=temp;
    }
}
