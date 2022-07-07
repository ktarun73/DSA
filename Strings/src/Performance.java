public class Performance {
    public static void main(String[] args) {
//        String series= "";
//        for (int i = 0;i<26;i++) {
//            char ch=(char)('a'+i);
//            series+=ch+" "; // Everytime this will create a new object , as Strings are immutable in JAVA
//        }
//        System.out.println(series);

        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch+" ");
        }
        System.out.println(builder);
    }

}
