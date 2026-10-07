import java.util.*;

class Student5 implements Comparable<Student5> {

    int rollNo;
    String name;
    int marks;

    Student5(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student5 other) {

        if (this.marks > other.marks)
            return 1;

        if (this.marks < other.marks)
            return -1;

        return 0;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class sorting5 {

    public static void main(String[] args) {

        ArrayList<Student5> students = new ArrayList<>();

        students.add(new Student5(101, "Rahul", 80));
        students.add(new Student5(102, "Neha", 60));
        students.add(new Student5(103, "Aman", 90));
        students.add(new Student5(104, "Riya", 70));

        students.sort(null);

        for (Student5 s : students) {
            System.out.println(s);
        }
    }
}
