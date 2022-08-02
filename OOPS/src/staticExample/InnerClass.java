package staticExample;

public class InnerClass {

    static class Test{
        String name;

        Test(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Test test1=new Test("Tarun");
        Test test2=new Test("Mehak");
        System.out.println(test1.name);
        System.out.println(test2.name);
    }
}

