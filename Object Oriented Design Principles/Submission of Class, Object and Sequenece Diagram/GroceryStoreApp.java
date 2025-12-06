import java.util.*;

class Product {
    private String productName;
    private double pricePerUnit;
    private double quantity;

    public Product(String productName, double pricePerUnit, double quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }
}

class Customer {
    private String name;
    private List<Product> products;

    public Customer(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}

class BillGenerator {
    public double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.getProducts()) {
            total += p.getTotalPrice();
        }
        return total;
    }
}

public class GroceryStoreApp {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Apples", 3, 2),
            new Product("Milk", 2, 1)
        );
        Customer customer = new Customer("Alice", products);
        BillGenerator generator = new BillGenerator();
        double total = generator.generateBill(customer);

        System.out.println("Customer: " + customer.getName());
        for (Product p : customer.getProducts()) {
            System.out.println(p.getProductName() + " - " + p.getQuantity() + " units @ $" + p.getPricePerUnit() + " = $" + p.getTotalPrice());
        }
        System.out.println("Total Bill: $" + total);
    }
}
