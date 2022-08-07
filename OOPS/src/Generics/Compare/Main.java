package Generics.Compare;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Student mehak=new Student(15,91.2f);
//        Student tarun=new Student(21,54.1f);
//
//        if(tarun.compareTo(mehak)<0){
//            System.out.println("Mehak has more marks");
//        }
//        else {
//            System.out.println("Tarun has more marks");
//        }
        Student st1=new Student(23,91.2f);;
        Student st2=new Student(21,41.0f);;
        Student st3=new Student(5,54.5f);;
        Student st4=new Student(45,71.9f);;
        Student st5=new Student(12,99.3f);;

        Student[] list={st1,st2,st3,st4,st5};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


    }
}
