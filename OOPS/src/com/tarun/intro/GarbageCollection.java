package com.tarun.intro;

public class GarbageCollection {
    public static void main(String[] args) {

//        A obj;
//       for(int i=0;i<10000000;i++){
//           obj=new A("abc");
//       }

        A obj=new A("abc");
        System.out.println(obj);

    }

    static class A{
        final int num=10;
        String name;
        public A(String name){
            this.name=name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }
}
