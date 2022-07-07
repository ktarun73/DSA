import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] ar={3,1,4,2,5};
        selectionSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void selectionSort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            int last= ar.length-i-1;
            int maxIndex=getMaxIndex(ar,last);
            swap(ar,maxIndex,last);
        }

    }

    private static int getMaxIndex(int[] ar, int end) {
        int max=0;
        for (int i =0; i <=end ; i++) {
            if(ar[max]<ar[i]) max=i;
        }
        return max;
    }

    static void swap(int[] ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

}
