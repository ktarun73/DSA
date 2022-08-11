package Strings;

import java.util.Arrays;

public class Substr {
    public static void main(String[] args) {
        String str="0123456";
        String subStr=str.substring(3);
//        String subStr=str.substring(3,6);
        System.out.println(subStr);

        String str1= "Hello, I am Tarun";
        String[] sentences=str1.split(" ");
        System.out.println(Arrays.toString(sentences));
        System.out.println(sentences.length);
        for (String sentence : sentences) {
            System.out.println(sentence);
        }

    }
}
