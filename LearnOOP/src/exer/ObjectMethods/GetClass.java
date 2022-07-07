package exer.ObjectMethods;

public class GetClass {
    public static void main(String[] args) {
        Order order = new Order(1, "TOM");
        System.out.println("class: " + order.getClass());
        System.out.println("super class: " + order.getClass().getSuperclass());
    }
}
