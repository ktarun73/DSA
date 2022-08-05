package EarlyAndLateBinding;


public class EarlyBinding {
    static class A{
        static int a=10;
        static void print(){
            System.out.println("In Super Class");
        }

        final void sample(){
            System.out.println("Sample super class");
        }
    }

    final static class B extends A{
        void incr(){
            a++;
        }

        B(){
            incr();
            super.sample();
        }

        //Early Binding
//        @Override
//        void sample() {
//            super.sample();
//        }
    }

    public static void main(String[] args) {
//        System.out.println(A.a);
//        System.out.println(A.a);
//        A.print();
//        B.print();
//        System.out.println(B.a);

        A a=new B();
        A.print();

    }
}
