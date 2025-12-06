abstract class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    abstract double discount();
}

interface Taxable {
    double tax();
}

class Electronics extends Product implements Taxable {
    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    double discount() {
        return getPrice() * 0.1;
    }

    @Override
    public double tax() {
        return getPrice() * 0.18;
    }
}

class Clothing extends Product implements Taxable {
    Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    double discount() {
        return getPrice() * 0.2;
    }

    @Override
    public double tax() {
        return getPrice() * 0.05;
    }
}

class Groceries extends Product {
    Groceries(String name, double price) {
        super(name, price);
    }

    @Override
    double discount() {
        return getPrice() * 0.05;
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics("Laptop", 50000),
            new Clothing("Shirt", 1000),
            new Groceries("Rice", 500)
        };

        for(Product p : products) {
            double finalPrice = p.getPrice() - p.discount();
            if(p instanceof Taxable) finalPrice += ((Taxable)p).tax();
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}
