import java.util.Scanner;

public class mx {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Lower Bound");
        int lb=scanner.nextInt();
        System.out.println("Enter upper Bound");
        int ub=scanner.nextInt();
        System.out.println("Prime numbers between "+lb+" and "+ub+" are: ");
        for(int i=lb;i<=ub;i++){
            if(i==1) continue;
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int x){
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
