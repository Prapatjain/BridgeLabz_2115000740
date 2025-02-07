
public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Order order = new Order(1001, "2025-02-01");
        ShippedOrder shippedOrder = new ShippedOrder(1002, "2025-02-02", 451616);
        DeliveredOrder deliveredOrder = new DeliveredOrder(1003, "2025-02-03", 816864, "2025-02-05");
        order.getOrderStatus();
        shippedOrder.getOrderStatus();
        deliveredOrder.getOrderStatus();
    }
}
