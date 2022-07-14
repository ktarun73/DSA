public class NonDuplicateInArray {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,1,2,3,4,5};
        System.out.println(findNonDuplicate(ar));
    }

    private static int findNonDuplicate(int[] ar) {
        int a=0;
        for (int j : ar) {
            a ^= j;
        }
        return a;
    }
}
