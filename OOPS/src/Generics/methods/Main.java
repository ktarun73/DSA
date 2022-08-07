package Generics.methods;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }

    static <E> void printArray(E[] ar){
        for(E a:ar){
            System.out.print(a+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        String[] str=new String[10];
        for(int i=0;i<str.length;i++){
            str[i]=(2*i)+"";
        }
        printArray(str);
        Collection<String> cs=new ArrayList<>();
        fromArrayToCollection(str,cs);
        System.out.println(cs);
    }
}
