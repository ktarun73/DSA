package ExceptionHandling.BuiltIn;

import java.util.Scanner;


public class Main {
    public static int divide(int a,int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("Please not divide by 0");
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        try{
            c=divide(a,b);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always executed");
        }
        System.out.println(c);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obj destroyed");
    }
}
