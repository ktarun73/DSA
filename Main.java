import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i:list) {
            System.out.print(i+" ");
        }
        System.out.println();
        list.remove(1);

        for (int i:list) {
            System.out.print(i+" ");
        }
    }
}
