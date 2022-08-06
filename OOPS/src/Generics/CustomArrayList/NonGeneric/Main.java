package Generics.CustomArrayList.NonGeneric;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.remove();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.set(1,3);
        System.out.println(list);

    }
}
