package basic.encapsulation;

public class OrderModifier {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //  同一个包中的其他类，不可以调用Order类中私有的属性、方法
        //	order.orderPrivate = 4;
        //	order.methodPrivate();
    }
}

//  权限大小：同类 < 同包 < 不同包(子类) < 不同包(不同类)
//  权限修饰符：private(同类) > default(同包) > protected(子类) > public(不同类)
class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){
        assign();
    }
    void methodDefault(){
        assign();
    }
    protected void methodProtected(){
        assign();
    }

    public void methodPublic(){
        assign();
    }
    private void assign() {
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }
}
