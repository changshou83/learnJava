package basic.func;

public class ValueTransfer {
    public static void main(String[] args) {
        assign();
        primitiveValueTransfer();
        referenceValueTransfer();
    }
    private static void assign() {
        System.out.println("***********基本数据类型：****************");
        int m = 10;
        int n = m;
        System.out.println("m = " + m + ", n = " + n);

        n = 20;
        System.out.println("m = " + m + ", n = " + n);

        System.out.println("***********引用数据类型：****************");
        Order o1 = new Order();
        o1.orderId = 1001;

        //赋值以后，o1和o2的地址值相同，都指向了堆空间中同一个对象实体。
        Order o2 = o1;
        System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId = " +o2.orderId);

        o2.orderId = 1002;
        System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId = " +o2.orderId);
    }
    private static void primitiveValueTransfer() {
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ", n = " + n);

        primitiveValueSwap(m, n);
        System.out.println("m = " + m + ", n = " + n);

    }
    private static void referenceValueTransfer() {
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m + ", n = " + data.n);

        referenceValueSwap(data);
        System.out.println("m = " + data.m + ", n = " + data.n);
    }
    private static void primitiveValueSwap(int m,int n) {
        int temp = m ;
        m = n;
        n = temp;
    }
    private static void referenceValueSwap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Order {
    int orderId;
}
class Data{
    int m;
    int n;
}
