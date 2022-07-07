package exer.ObjectMethods;

public class Order {
    private int orderId;
    private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderId, String orderName) {
        super();
        this.orderId = orderId;
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Order) {
            Order order = (Order) obj;
            //正确的：
            return this.orderId == order.orderId &&
                    this.orderName.equals(order.orderName);
            //错误的：因为String是包装类，不能直接 == 判断
            //			return this.orderId == order.orderId &&
            //					this.orderName == order.orderName;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Order [id=" + orderId + ",name=" + orderName +"]";
    }

    public static void main(String[] args) {
    }
}
