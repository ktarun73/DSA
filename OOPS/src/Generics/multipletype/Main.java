package Generics.multipletype;

class Test<E,V>{
    private Object[] data1;
    private Object[] data2;
    private int size;

    public Test() {
        data1=new Object[5];
        data2=new Object[5];
    }

    public void add(E d1,V d2){
        data1[size]=d1;
        data2[size]=d2;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<size;i++){
            str.append(data1[i]).append(" ").append(data2[i]).append("\n");
        }
        return str.toString();
    }
}

public class Main {
    public static void main(String[] args) {

        Test<String,Integer> test=new Test<>();
        test.add("Tarun",1);
        test.add("Mehak",2);
        test.add("Goldi",3);
        test.add("Sarthak",4);
        test.add("Vikram",5);
        System.out.println(test);

    }
}
