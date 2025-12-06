class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("Generic Person");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Teacher of subject: " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Student in grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Staff in department: " + department);
    }
}

public class SchoolSystemDemo {
    public static void main(String[] args) {
        Person[] people = {
            new Teacher("Alice", 30, "Math"),
            new Student("Bob", 14, 8),
            new Staff("Charlie", 40, "Administration")
        };

        for (Person p : people) {
            System.out.println("Name: " + p.name + ", Age: " + p.age);
            p.displayRole();
            System.out.println("------");
        }
    }
}
