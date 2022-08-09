package ObjectCloning.Deepcopy;

public class Human implements Cloneable {
    int age;
    String name;
    int[] ar;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.ar=new int[]{1,2,3,4,5};
    }

    @Override
    public Object clone()throws CloneNotSupportedException{
        //this is shallow copy
        Human temp=(Human) super.clone();

        // make a deep copy
        temp.ar=new int[temp.ar.length];
        System.arraycopy(this.ar, 0, temp.ar, 0, temp.ar.length);
        return temp;
    }
}
