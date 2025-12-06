import java.util.*;

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

class Course {
    String title;
    Professor professor;
    List<Student> students = new ArrayList<>();
    Course(String title) { this.title = title; }
    void assignProfessor(Professor p) { professor = p; }
    void addStudent(Student s) { students.add(s); }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String name) { this.name = name; }
    void enrollCourse(Course c) { courses.add(c); c.addStudent(this); }
}

public class Problem5 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Professor p1 = new Professor("Dr. Smith");
        Course c1 = new Course("Math");
        c1.assignProfessor(p1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        System.out.println("Professor " + c1.professor.name + " teaches " + c1.title);
        for (Student s : c1.students) System.out.println("Student: " + s.name);
    }
}

