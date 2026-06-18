class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class StudentUpdate {
    static void updateMarks(Student s) {
        s.marks += 10;
    }

    public static void main(String[] args) {
        Student s = new Student(80);

        System.out.println("Before Update: " + s.marks);

        updateMarks(s);

        System.out.println("After Update: " + s.marks);
    }
}