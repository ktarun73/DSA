import java.util.Arrays;
import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        int[] ar=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            ar[i]= sc.nextInt();
        }
        revArray(ar,3,4);
        System.out.println(Arrays.toString(ar));

    }

    public static void revArray(int[] ar,int start,int end){
        int temp=0;
        while(start<end){
            temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
    }



}
