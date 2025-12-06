abstract class Patient {
    private String id;
    private String name;
    private int age;

    Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    abstract double bill();
}

interface MedicalRecord {
    void addRecord(String record);
    void showRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private String[] records = new String[10];
    private int count = 0;
    private double dailyRate;

    InPatient(String id, String name, int age, double dailyRate) {
        super(id, name, age);
        this.dailyRate = dailyRate;
    }

    @Override
    double bill() { return dailyRate * 5; }

    @Override
    public void addRecord(String record) { records[count++] = record; }

    @Override
    public void showRecords() {
        for(int i=0;i<count;i++) System.out.println(records[i]);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private String[] records = new String[10];
    private int count = 0;
    private double visitFee;

    OutPatient(String id, String name, int age, double visitFee) {
        super(id, name, age);
        this.visitFee = visitFee;
    }

    @Override
    double bill() { return visitFee; }

    @Override
    public void addRecord(String record) { records[count++] = record; }

    @Override
    public void showRecords() {
        for(int i=0;i<count;i++) System.out.println(records[i]);
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("P101", "Alice", 30, 1000),
            new OutPatient("P102", "Bob", 40, 500)
        };

        for(Patient p : patients) {
            System.out.println(p.getName() + " Bill: " + p.bill());
        }
    }
}
