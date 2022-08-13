package Strings;

public class StringPerformance {
    public static void main(String[] args) {
        String str="";
        for (int i = 0; i < 10; i++) {
            str+="a";
            // we know strings in java are immutable so if we want to change the value of string java will create a new object everytime
            // so this is a costly operation
        }
        System.out.println(str);

        // To overcome this problem we can use StringBuilder ,so everytime we want to do some changes in string this will just append at the end
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s.append('a');
        }
        System.out.println(s);
    }
}
