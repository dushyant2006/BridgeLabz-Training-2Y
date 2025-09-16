class CarRental {
    String customerName, carModel;
    int rentalDays;
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    int calculateCost() {
        return rentalDays * 1000;
    }
}