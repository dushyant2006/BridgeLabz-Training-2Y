class Vehicle {
    static int fee = 5000;
    final String regNo;
    String owner, type;

    Vehicle(String owner, String type, String regNo) {
        this.owner = owner;
        this.type = type;
        this.regNo = regNo;
    }

    static void setFee(int f) {
        fee = f;
    }

    void show() {
        if (this instanceof Vehicle) {
            System.out.println(owner + " - " + type + " - " + regNo + " - " + fee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Arjun", "Car", "DL01A1234");
        Vehicle v2 = new Vehicle("Meena", "Bike", "UP02B5678");
        v1.show();
        v2.show();
        Vehicle.setFee(6000);
        v1.show();
    }
}