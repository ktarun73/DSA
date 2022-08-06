package AbstactClass;

abstract class Parent{
    abstract String course();
    abstract String career();

    final int num;
    static int num2=0;

    public Parent(int num) {
        this.num = num;
        Parent.num2++;
    }

}

class Child extends Parent{

    String course;
    String career;

    public Child(String course, String career) {
        super(23);
        this.course = course;
        this.career = career;
    }

    @Override
    String career() {
        return this.career;
    }

    @Override
    String course() {
        return this.course;
    }

    @Override
    public String toString() {
        return "Child{" +
                "course='" + course + '\'' +
                ", career='" + career + '\'' +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        Child child=new Child("MCA","Engineer");
        System.out.println(child);

    }
}
