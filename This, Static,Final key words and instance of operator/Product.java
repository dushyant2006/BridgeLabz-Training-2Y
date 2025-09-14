class Product {
    static double disc = 5;
    final int pid;
    String name;
    double price;
    int qty;

    Product(int pid, String name, double price, int qty) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    static void setDisc(double d) {
        disc = d;
    }

    void show() {
        if (this instanceof Product) {
            System.out.println(pid + " - " + name + " - " + price + " - " + qty + " - " + disc + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Pen", 10, 5);
        Product p2 = new Product(2, "Book", 50, 2);
        p1.show();
        p2.show();
        Product.setDisc(10);
        p1.show();
    }
}