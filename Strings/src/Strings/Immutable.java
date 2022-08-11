package Strings;

public class Immutable {
    public static void main(String[] args) {
        String name1="Tarun";
        String name2="Tarun";
        String name3="Tarun";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println();
        // each of them is pointing to the same object in string pool
        // now we change value of name3
        name3="Mehak";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        // value changed for name3 only because in java stings are immutable (state cannot be changed after object is created)
        // this is because of security reasons
        // if one wants to change value then it will be change only for it not for others

    }
}
