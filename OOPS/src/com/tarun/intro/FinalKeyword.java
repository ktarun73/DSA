package com.tarun.intro;

public class FinalKeyword {
    public static void main(String[] args) {
        final int BONUS=2000;
        greet();
        //Here we can change value but cant reassign it(e.g.- tarun= Other obj)
        final Student2 tarun=new Student2("Tarun");
//        tarun=new Student2("Mehak");
    }

    final static void greet(){
        System.out.println("Hello World");
    }
}
