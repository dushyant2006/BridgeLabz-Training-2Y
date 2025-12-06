abstract class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    abstract double calculateSalary();

    void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

interface Department {
    void setDepartment(String dept);
    String getDepartment();
}

class FullTimeEmployee extends Employee implements Department {
    private String dept;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return getSalary();
    }

    @Override
    public void setDepartment(String dept) { this.dept = dept; }

    @Override
    public String getDepartment() { return dept; }
}

class PartTimeEmployee extends Employee implements Department {
    private String dept;
    private int hours;

    PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        this.hours = hours;
    }

    @Override
    double calculateSalary() {
        return getSalary() * hours;
    }

    @Override
    public void setDepartment(String dept) { this.dept = dept; }

    @Override
    public String getDepartment() { return dept; }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] list = {
            new FullTimeEmployee(101, "Alice", 50000),
            new PartTimeEmployee(102, "Bob", 200, 100)
        };

        for(Employee e : list) {
            e.showDetails();
        }
    }
}
