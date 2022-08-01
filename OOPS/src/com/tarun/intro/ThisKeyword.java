package com.tarun.intro;

public class ThisKeyword {

    static class Student{
        int rollno;
        String name;
        float fee;
        Student(int rollno,String name,float fee){
            // Used as reference variable to refer current class instance variable
            this.rollno=rollno;
            this.name=name;
            this.fee=fee;
            // Use to invoke current class methods
            this.display();
        }
        void display(){
            System.out.println(rollno+" "+name+" "+fee);
        }


    }
    static class A{
        A(){
            System.out.println("Hello 1");
        }
        A(int x){
            //Invoke current class constructor
            this();
            System.out.println(x);
        }

    }

    static class S2{
        void m(S2 obj){
            System.out.println("Method Invoked");
        }
        void p(){
            //Used as argument to pass in method
            m(this);
        }
    }


    static class B2{
        A4 obj;
        B2(A4 obj){
            this.obj=obj;
        }
        void display(){
            System.out.println(obj.data);
        }

    }
    static class A4{
        int data=10;
        A4(){
            //this: to pass as argument in the constructor call
            B2 b2=new B2(this);
            b2.display();

        }

    }

    static class A5{
        //this keyword can be used to return current class instance
        A5 getA(){
            return this;
        }
        void msg(){
            System.out.println("Hello java");
        }
    }
        public static void main(String args[]) {
            Student s1 = new Student(111, "ankit", 5000f);
            Student s2 = new Student(112, "sumit", 6000f);

            A a=new A(3);

            S2 S2=new S2();
            S2.p();

            A4 a4=new A4();

            A5 a5=new A5();
            a5.getA().msg();

    }

}

