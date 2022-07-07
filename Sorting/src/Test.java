public class Test {
    public static void main(String[] args) {
        int[] ar={3,1,4,5,2};
        bubbleSort(ar);
        print(ar);
        int[] ar2={3,1,4,5,2};
        System.out.println("Selection Sort");
        print(ar2);
        selectionSort(ar2);

    }

    private static void selectionSort(int[] ar2) {
        int n= ar2.length;
        for (int i = 0; i < n; i++) {
            int last=n-i-1;
            int maxIdx=getMaxIdx(ar2,last);
            swap(ar2,last,maxIdx);
            print(ar2);
        }

    }

    private static int getMaxIdx(int[] ar2, int last) {
        int max=0;
        for (int i = 0; i < last; i++) {
            if(ar2[max]<ar2[i]) max=i;
        }
        return max;
    }

    private static void bubbleSort(int[] ar) {
        int n= ar.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if(ar[j]<ar[j-1]){
                    swap(ar,j,j-1);
                    print(ar);
                }
            }
        }
    }

    private static void swap(int[] ar, int j, int i) {
        int temp=ar[j];
        ar[j]=ar[i];
        ar[i]=temp;
    }

    static void print(int[] ar){
        for (int j : ar) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}