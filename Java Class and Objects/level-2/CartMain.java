public class CartMain {
    public static void main(String[] args) {
        CartItem c = new CartItem("Book", 200, 2);
        c.addItem(1);
        c.removeItem(1);
        c.displayTotal();
    }
}
