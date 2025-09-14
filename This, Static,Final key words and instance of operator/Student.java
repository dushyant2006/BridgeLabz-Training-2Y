class Student {
    static String uni = "Delhi University";
    static int total = 0;
    final int roll;
    String name, grade;

    Student(String name, int roll, String grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
        total++;
    }

    static void showTotal() {
        System.out.println("Students: " + total);
    }

    void show() {
        if (this instanceof Student) {
            System.out.println(name + " - " + roll + " - " + grade + " - " + uni);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Karan", 1, "A");
        Student s2 = new Student("Pooja", 2, "B");
        s1.show();
        s2.show();
        Student.showTotal();
    }
}