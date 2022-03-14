import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ar=new int[10];
        System.out.println("Enter array elements ");
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            ar[i]=scanner.nextInt();   
        }
        int element=0,index=-1;;
        System.out.println("Which element you want to check");
        element=scanner.nextInt();
        boolean isPresent=false;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==element){
                isPresent=true;
                index=i;
                break;
            }
        }
        if(isPresent){
            System.out.println(element+" is present at index "+index);
        }
        else{
            System.out.println(element+" is not present");
        }
    }
}
