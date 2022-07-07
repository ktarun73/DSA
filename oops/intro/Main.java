package oops.intro;

public class Main {
    public static void main(String[] args) {
        Student st1=new Student(1,"Tarun",7.7f);
//        System.out.println(st1);
    }

}
class Student{
int rollNo;
String name;
float marks;
void greeting(){
    System.out.println("Hello "+this.name);
}
Student(int roll,String name,float marks){
    this.rollNo=roll;
    this.name=name;
    this.marks=marks;

    greeting();

}

}