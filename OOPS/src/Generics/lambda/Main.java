package Generics.lambda;

//import java.util.ArrayList;
//import java.util.function.Consumer;

public class Main{
    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            arr.add(i+1);
//        }
//        Consumer<Integer> consumer= (item) -> System.out.print((item * 2) + "  ");
//        arr.forEach(consumer);
        Main calc=new Main();
        Operation sum=(a, b) -> a+b;
        Operation sub=(a, b) -> a-b;
        Operation prod=(a, b) -> a*b;
        System.out.println(calc.operation(2,4,sum));
        System.out.println(calc.operation(2,4,sub));
        System.out.println(calc.operation(2,4,prod));





    }

    private int operation(int a,int b,Operation op){
        return op.op(a,b);
    }


    @FunctionalInterface
    interface Operation {
        int op(int a,int b);
        default int sum(){
            return 0;
        }
    }
}
