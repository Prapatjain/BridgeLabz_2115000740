
public class DeliveredOrder extends ShippedOrder{
    String deliveryDate ;
    DeliveredOrder(int orderId, String orderDate,int trackingNumber,String deliveryDate){
        super(orderId,orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    void getOrderStatus(){
        System.out.println("order delivered on "+deliveryDate);
    }
}
