import java.util.*;

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

class Department {
    String name;
    Department(String name) { this.name = name; }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();
    University(String name) { this.name = name; }
    void addDepartment(Department d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }
    void deleteUniversity() { departments.clear(); }
}

public class Problem2 {
    public static void main(String[] args) {
        University u = new University("XYZ University");
        Department d1 = new Department("CS");
        Department d2 = new Department("Math");
        Faculty f1 = new Faculty("Dr. Smith");
        u.addDepartment(d1); u.addDepartment(d2);
        u.addFaculty(f1);
        System.out.println("Departments: " + u.departments.size());
        u.deleteUniversity();
        System.out.println("Departments after delete: " + u.departments.size());
        System.out.println("Faculty still exists: " + f1.name);
    }
}
