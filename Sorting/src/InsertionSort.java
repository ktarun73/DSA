import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ar={-1,0,2,3,3,1,4,5,2};
        insertionSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void insertionSort(int[] ar) {
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(ar[j]<ar[j-1]) swap(ar,j,j-1);
                else break;
            }
        }

    }

    private static void swap(int[] ar, int j, int i) {
        int temp=ar[j];
        ar[j]=ar[i];
        ar[i]=temp;
    }
}
