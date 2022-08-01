package com.tarun.intro;

class example{
    example(){
        System.out.println("Object created");
    }
    example(int x){
        System.out.println("Parametrized constructor");
        System.out.println("Parametrized constructor");
    }
}

public class Constructor {
    public static void main(String[] args) {
        example example=new example();
        example example2=new example(4);
    }
}
