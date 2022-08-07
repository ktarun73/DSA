package Generics.lambda;

@FunctionalInterface
interface Test1{
    boolean isOdd(int num);
}

@FunctionalInterface
interface Test2{
    boolean isPrime(int num);
}
public class Test {
    public static void main(String[] args) {
        Test1 test1=(a)-> a%2==0;
        System.out.println(test1.isOdd(12)+"\n\n");







        Test2 test2=(num)->{
            for(int i=num/2;i>=1;i--){
                if(num%i==0) return false;
            }
            return true;
        };

        System.out.println(test2.isPrime(44));



    }

}
