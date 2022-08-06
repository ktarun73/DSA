package Generics.CustomArrayList.Generic;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list=new CustomArrayList<>();
        for (int i = 0; i < 13; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.remove();
        list.remove();
        list.remove();

        System.out.println(list);
        System.out.println(list.get(3));
        list.set(10,45);
        System.out.println(list.get(10));
    }
}
