import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] ar={3,1,0,2,4,-5};
        bubbleSort(ar);
        System.out.println("Bubble sort");
        System.out.println(Arrays.toString(ar));
        System.out.println();
        System.out.println();
        System.out.println();


        int[] ar2={3,1,0,2,4,-5};
        insertionSort(ar2);
        System.out.println("Insertion sort");
        System.out.println(Arrays.toString(ar2));
    }

    private static void insertionSort(int[] ar2) {
        for (int i = 0; i < ar2.length; i++) {
            int last= ar2.length-i-1;
            int maxIdx=getMaxIdx(ar2,last);
            swap(ar2,last,maxIdx);
        }
    }

    private static int getMaxIdx(int[] ar2, int last) {
        int max=0;
        for (int i = 1; i<=last; i++) {
            if(ar2[i]>ar2[max]) max=i;
        }
        return max;
    }

    private static void bubbleSort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length-i; j++) {
                if(ar[j]<ar[j-1]) swap(ar,j,j-1);
            }
        }
    }

    private static void swap(int[] ar, int i, int j) {
        int temp=ar[j];
        ar[j]=ar[i];
        ar[i]=temp;
    }


}
