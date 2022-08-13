package Strings;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("String Buffer");
        StringBuffer str2=new StringBuffer("String Buffer");
        System.out.println(str.equals(str2));
        str.append(0);
        str.insert(0,"abc ");
        str.replace(0,4 ,"fgh ");
        str.delete(0,4);
        str.reverse();
        str.reverse();
        System.out.println(str.capacity());
        System.out.println(str);

    }
}
