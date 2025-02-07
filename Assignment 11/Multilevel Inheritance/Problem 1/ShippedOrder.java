
public class ShippedOrder extends Order {
    int trackingNumber;
    ShippedOrder(int orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    void getOrderStatus(){
        System.out.println("order shipped. Tranking number: "+trackingNumber);
    }
}
