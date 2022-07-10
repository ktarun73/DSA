public class BinarySearch {
    public static void main(String[] args) {
        int[] ar={1,2,3};
        int ans=binarySearch(ar,5,0,ar.length-1);
        System.out.println(ans);
    }

    private static int binarySearch(int[] ar,int target,int start,int end) {
        if(start>end) return -1;
        int m=start+(end-start)/2;
        if(ar[m]==target) return m;
        if(ar[m]<target) return binarySearch(ar,target,m+1,end);
        return binarySearch(ar,target,start,m-1);
    }
}
