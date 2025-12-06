abstract class FoodItem {
    private String name;
    private double price;
    private int quantity;

    FoodItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    abstract double totalPrice();
}

interface Discountable {
    double applyDiscount();
}

class VegItem extends FoodItem implements Discountable {
    VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    double totalPrice() { return getPrice() * getQuantity(); }

    @Override
    public double applyDiscount() { return totalPrice() * 0.05; }
}

class NonVegItem extends FoodItem implements Discountable {
    NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    double totalPrice() { return getPrice() * getQuantity() + 50; }

    @Override
    public double applyDiscount() { return totalPrice() * 0.1; }
}

public class FoodDeliveryDemo {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Curry", 200, 2),
            new NonVegItem("Chicken Biryani", 300, 1)
        };

        for(FoodItem f : order) {
            double finalPrice = f.totalPrice();
            if(f instanceof Discountable) finalPrice -= ((Discountable)f).applyDiscount();
            System.out.println(f.getName() + " Final Price: " + finalPrice);
        }
    }
}
