// Base class
class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped with Tracking Number: " + trackingNumber;
    }
}

// Subclass extending ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on: " + deliveryDate;
    }
}

// Demo
public class OrderManagementDemo {
    public static void main(String[] args) {
        Order o1 = new Order("ORD001", "2025-09-20");
        ShippedOrder o2 = new ShippedOrder("ORD002", "2025-09-21", "TRK123");
        DeliveredOrder o3 = new DeliveredOrder("ORD003", "2025-09-22", "TRK456", "2025-09-25");

        Order[] orders = {o1, o2, o3};
        for (Order o : orders) {
            System.out.println("Order ID: " + o.orderId + ", Status: " + o.getOrderStatus());
        }
    }
}
