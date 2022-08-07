package Generics.Compare;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff= (int) (this.marks-o.marks);
        // if diff == 0: both are equal
        //if diff < 0: o is bigger else o is smaller

        return diff;
    }

    @Override
    public String
    toString() {
        return marks+" ";
    }
}
