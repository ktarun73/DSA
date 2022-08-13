package Strings;
import java.lang.StringBuffer;

public class StringPerformance2 {
    static String concatWithString(){
        String str="";
        for (int i = 0; i < 10; i++) {
            str+=(char)i;
        }
        return str;
    }

    static String concatWithStringBuffer(){
        StringBuffer str=new StringBuffer();
        for (int i = 0; i < 10; i++) {
            str.append((char) i);
        }
        return str.toString();
    }

    static String concatWithStringBuilder(){
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < 10; i++) {
            str.append((char) i);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
//        concatWithString();
//        System.out.println("Concat with String "+startTime+" ms");
//        startTime=System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Concat with StringBuffer "+startTime+" ms");
        startTime=System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Concat with StringBuilder "+startTime+" ms");
    }
}
