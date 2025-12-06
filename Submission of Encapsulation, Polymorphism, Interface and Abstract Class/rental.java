abstract class Vehicle {
    private String number;
    private String type;
    private double rate;

    Vehicle(String number, String type, double rate) {
        this.number = number;
        this.type = type;
        this.rate = rate;
    }

    public String getNumber() { return number; }
    public String getType() { return type; }
    public double getRate() { return rate; }
    public void setRate(double rate) { this.rate = rate; }

    abstract double rentCost(int days);
}

interface Insurable {
    double insurance();
}

class Car extends Vehicle implements Insurable {
    Car(String number, double rate) { super(number, "Car", rate); }

    @Override
    double rentCost(int days) { return getRate() * days; }

    @Override
    public double insurance() { return 2000; }
}

class Bike extends Vehicle implements Insurable {
    Bike(String number, double rate) { super(number, "Bike", rate); }

    @Override
    double rentCost(int days) { return getRate() * days; }

    @Override
    public double insurance() { return 500; }
}

class Truck extends Vehicle implements Insurable {
    Truck(String number, double rate) { super(number, "Truck", rate); }

    @Override
    double rentCost(int days) { return getRate() * days; }

    @Override
    public double insurance() { return 5000; }
}

public class rental {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C123", 1000),
            new Bike("B456", 300),
            new Truck("T789", 2000)
        };

        for(Vehicle v : vehicles) {
            double total = v.rentCost(5);
            if(v instanceof Insurable) total += ((Insurable)v).insurance();
            System.out.println(v.getType() + " " + v.getNumber() + " Total: " + total);
        }
    }
}
