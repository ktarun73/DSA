package properties.encapsulation;

class EncapTest{
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        EncapTest test=new EncapTest();
        test.setId(1);
        test.setName("Tarun");
        test.setAge(22);
        System.out.println(test.getId()+" "+test.getName()+" "+test.getAge());

        EncapTest test2=new EncapTest();
        test2.setId(2);
        test2.setName("Mehak");
        test2.setAge(22);
        System.out.println(test2.getId()+" "+test2.getName()+" "+test2.getAge());
    }
}
