package Strings;


public class Concatenation {
    public static void main(String[] args) {
        String s1="Sachin"+"Tendulkar";
        System.out.println(s1);
//        Java convert about line to-
//        String s1=new StringBuilder().append("Sachin").append("Tendulkar").toString();

        String s2="Sachin";
        String s3="Tendulkar";
        String s4=s2.concat(s3);
        System.out.println(s4);




    }
}
