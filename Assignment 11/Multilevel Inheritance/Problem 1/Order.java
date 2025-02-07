
public class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate){
        this.orderId =orderId;
        this.orderDate = orderDate;
    }
    void getOrderStatus(){
        System.out.println("Order placed.");
        System.out.println("OrderId= "+orderId+",order date= "+orderDate);
    }
}
