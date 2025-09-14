class Patient {
    static String hospital = "Apollo";
    static int total = 0;
    final int id;
    String name, disease;
    int age;

    Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        total++;
    }

    static void showTotal() {
        System.out.println("Patients: " + total);
    }

    void show() {
        if (this instanceof Patient) {
            System.out.println(id + " - " + name + " - " + age + " - " + disease + " - " + hospital);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Sita", 30, "Fever");
        Patient p2 = new Patient(2, "Ravi", 25, "Cold");
        p1.show();
        p2.show();
        Patient.showTotal();
    }
}