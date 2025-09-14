class Employee {
    static String company = "TCS";
    static int total = 0;
    final int id;
    String name, post;

    Employee(String name, int id, String post) {
        this.name = name;
        this.id = id;
        this.post = post;
        total++;
    }

    static void showTotal() {
        System.out.println("Employees: " + total);
    }

    void show() {
        if (this instanceof Employee) {
            System.out.println(name + " - " + id + " - " + post + " - " + company);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 1, "Manager");
        Employee e2 = new Employee("Riya", 2, "Tester");
        e1.show();
        e2.show();
        Employee.showTotal();
    }
}