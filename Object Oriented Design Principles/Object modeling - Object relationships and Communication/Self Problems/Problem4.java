import java.util.*;

class Product {
    String name;
    Product(String name) { this.name = name; }
}

class Order {
    List<Product> products = new ArrayList<>();
    void addProduct(Product p) { products.add(p); }
    void showProducts() {
        for (Product p : products) System.out.println(p.name);
    }
}

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();
    Customer(String name) { this.name = name; }
    void placeOrder(Order o) { orders.add(o); }
    void showOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) o.showProducts();
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Customer c1 = new Customer("John");
        Order o1 = new Order();
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");
        o1.addProduct(p1); o1.addProduct(p2);
        c1.placeOrder(o1);
        c1.showOrders();
    }
}
