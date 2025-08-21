public class Discount {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        int discount = (fee * discountPercent) / 100;
        int discountedPrice = fee - discount;
        System.out.println("Discounted amount is " + discount);
        System.out.println("Discounted price is " + discountedPrice);
    }
}
