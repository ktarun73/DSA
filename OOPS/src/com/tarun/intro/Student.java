package com.tarun.intro;
class Student2 {
    int rollNo;
    String name;
    float marks;

    Student2(int rollNo, String name, float marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
        this.display();
    }

    Student2(int rollNo){
        this.rollNo=rollNo;
        this.display();
    }

    Student2(String name){
        this.name=name;
        this.display();
    }

    Student2(float marks){
        this.marks=marks;
        this.display();
    }

    Student2(){
        this(-1,"default",0.0f);
    }

    Student2(Student2 other){
        this(other.rollNo, other.name, other.marks);
    }

    void display(){
        System.out.println(this.rollNo+" "+this.name+" "+this.marks);
    }
}
public class Student {
    public static void main(String[] args) {

        Student2 tarun=new Student2(1,"Tarun" , 76f);
        Student2 mehak=new Student2(2,"Mehak" , 92f);
        Student2 student=new Student2();
        Student2 oth=new Student2(mehak);

        Student2 stu1=tarun;
        stu1.display();
        stu1.name="Raj";
        stu1.display();
        tarun.display();
    }
}