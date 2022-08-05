package ObjectClass;

import java.util.ArrayList;

public class Main{
    int num;
    Main(int num){
        this.num=num;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        Main obj=new Main(34);
        System.out.println(obj.hashCode());

        Main obj2=new Main(34);
        System.out.println(obj2.hashCode());

        Main obj3=obj2;
        System.out.println(obj3.hashCode());

//        System.out.println(obj2==obj3);

        if(obj3.equals(obj2)){
            System.out.println(obj2==obj3);
        }
        System.out.println(obj instanceof Main);
        System.out.println(obj.getClass());
        System.out.println(new ArrayList<>().getClass());
    }
}
