package com.tarun.intro;
class Student{
    int rollNo;
    String name;
    float marks;

    Student(int rollNo, String name, float marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
        this.display();
    }

    Student(){
        this(-1,"default",0.0f);
    }

    Student(Student other){
        this(other.rollNo, other.name, other.marks);
    }

    void display(){
        System.out.println(this.rollNo+" "+this.name+" "+this.marks);
    }
}
public class Main {
    public static void main(String[] args) {

        Student tarun=new Student(1,"Tarun" , 76f);
        Student mehak=new Student(2,"Mehak" , 92f);
        Student student=new Student();
        Student oth=new Student(mehak);

        Student stu1=tarun;
        stu1.display();
        stu1.name="Raj";
        stu1.display();
        tarun.display();
    }
}