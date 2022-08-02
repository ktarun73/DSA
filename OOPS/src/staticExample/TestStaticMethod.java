package staticExample;

class Student{
    int rollNo;
    String name;
    static String college="CU";

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    static void change(){
        Student.college="CGC";
    }

    void display(){
        System.out.println(this.rollNo+" "+this.name+" "+Student.college);
    }


}
public class TestStaticMethod {
    public static void main(String[] args) {
        System.out.println(Student.college);
        Student.change();
        Student tarun=new Student(1,"Tarun");
        Student mehak=new Student(2,"Mehak");
        tarun.display();
        mehak.display();
    }




}
