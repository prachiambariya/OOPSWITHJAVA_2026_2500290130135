import java.util.ArrayList;
import java.util.Comparator;

 class Student1 {

    int rollno;
    int marks;
    String name;

    Student1(String n, int r, int m) {
        name = n;
        rollno = r;
        marks = m;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", Roll No: " + rollno
                + ", Marks: " + marks;
    }
}

class CustomComparator implements Comparator<Student1> {

    @Override
    public int compare(Student1 o1, Student1 o2) {

        // Higher marks should come first
        if (o1.marks > o2.marks)
            return -1;

        if (o1.marks < o2.marks)
            return 1;

        // If marks are same,
        // smaller roll number should come first
        return o1.rollno - o2.rollno;
    }
}

public class comparableDemo {

    public static void main(String[] args) {

        ArrayList<Student1> st = new ArrayList<>();

        st.add(new Student1("Rahul", 1, 100));
        st.add(new Student1("Nitesh", 10, 20));
        st.add(new Student1("Neetish", 7, 80));
        st.add(new Student1("Nilesh", 9, 70));

        st.sort(new CustomComparator());

        for (Student1 s : st) {
            System.out.println(s);
        }
    }
}









