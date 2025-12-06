abstract class Vehicle {
    private String id;
    private String driver;
    private double ratePerKm;

    Vehicle(String id, String driver, double rate) {
        this.id = id;
        this.driver = driver;
        this.ratePerKm = rate;
    }

    public String getId() { return id; }
    public String getDriver() { return driver; }
    public double getRate() { return ratePerKm; }

    abstract double fare(double distance);
    void showDetails() {
        System.out.println("Vehicle: " + id + ", Driver: " + driver);
    }
}

interface GPS {
    String location();
    void updateLocation(String loc);
}

class Car extends Vehicle implements GPS {
    private String loc = "Unknown";

    Car(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    double fare(double distance) { return getRate() * distance; }

    @Override
    public String location() { return loc; }

    @Override
    public void updateLocation(String loc) { this.loc = loc; }
}

class Bike extends Vehicle implements GPS {
    private String loc = "Unknown";

    Bike(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    double fare(double distance) { return getRate() * distance * 0.8; }

    @Override
    public String location() { return loc; }

    @Override
    public void updateLocation(String loc) { this.loc = loc; }
}

class Auto extends Vehicle implements GPS {
    private String loc = "Unknown";

    Auto(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    double fare(double distance) { return getRate() * distance * 0.9; }

    @Override
    public String location() { return loc; }

    @Override
    public void updateLocation(String loc) { this.loc = loc; }
}

public class RideHailingDemo {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("C101", "Alice", 15),
            new Bike("B102", "Bob", 10),
            new Auto("A103", "Charlie", 12)
        };

        for(Vehicle v : rides) {
            System.out.println(v.getDriver() + " Fare for 10km: " + v.fare(10));
        }
    }
}
