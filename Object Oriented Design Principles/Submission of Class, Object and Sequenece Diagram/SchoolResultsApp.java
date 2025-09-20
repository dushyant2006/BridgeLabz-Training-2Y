import java.util.*;

class Subject {
    private String subjectName;
    private int marks;

    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

class GradeCalculator {
    public String calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.getSubjects()) {
            total += s.getMarks();
        }
        double average = total / (double) student.getSubjects().size();
        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 50) return "C";
        else return "D";
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        List<Subject> subjects = Arrays.asList(
            new Subject("Maths", 90),
            new Subject("Science", 85)
        );
        Student student = new Student("John", subjects);
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student);

        System.out.println("Student: " + student.getName());
        for (Subject s : student.getSubjects()) {
            System.out.println(s.getSubjectName() + ": " + s.getMarks());
        }
        System.out.println("Grade: " + grade);
    }
}
