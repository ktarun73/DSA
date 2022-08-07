package ObjectCloning.Shallowcopy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human tarun=new Human(22,"Tarun");
//        Human twin=new Human(tarun);
        Human twin= (Human) tarun.clone();
//        System.out.println(twin.age+" "+twin.name);
        twin.ar[0]=100;
        System.out.println(Arrays.toString(twin.ar));
        System.out.println(Arrays.toString(tarun.ar));


    }
}
