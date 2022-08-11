package Strings;

public class LiteralVsNew {
    public static void main(String[] args) {
        char[] ch={'s','t','r','i','n','g'};
        String str=new String(ch);
        System.out.println(str);

        String s1="Cat";
        String s2="Cat";
        System.out.println(s1==s2); // true because both are pointing towards same sting in string constant pool
        String s3=new String("Cat");
        System.out.println(s1==s3); // // false because both are not pointing towards same string object
        System.out.println(s1.equals(s1)); // true because here values of both the strings are compared
    }
}
