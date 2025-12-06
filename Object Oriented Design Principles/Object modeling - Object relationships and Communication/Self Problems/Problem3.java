import java.util.*;

class Patient {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    Patient(String name) { this.name = name; }
    void consultDoctor(Doctor d) { doctors.add(d); d.patients.add(this); d.consult(this); }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();
    Doctor(String name) { this.name = name; }
    void consult(Patient p) { System.out.println(name + " consults " + p.name); }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    Hospital(String name) { this.name = name; }
    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }
}

public class Problem3 {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. John");
        Doctor d2 = new Doctor("Dr. Emma");
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        h.addDoctor(d1); h.addDoctor(d2);
        h.addPatient(p1); h.addPatient(p2);
        p1.consultDoctor(d1);
        p2.consultDoctor(d1);
        p2.consultDoctor(d2);
    }
}
