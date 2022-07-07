package exer.ObjectMethods;

import java.util.Date;

/*
 * Object类中toString()的使用：
 *
 * 1. 当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 *
 * 2. Object类中toString()的定义：
 *   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
     }
 *
 * 3. 像String、Date、File、包装类等都重写了Object类中的toString()方法。
 *    使得在调用对象的toString()时，返回"实体内容"信息
 *
 * 4. 自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"
 */

public class ToString {
    public static void main(String[] args) {
        // 重写toString方法
        Order order = new Order(21, "Tom");
        System.out.println(order.toString());// Order [id=21,name=Tom]
        System.out.println(order);// Order [id=21,name=Tom]

        // 包装类
        String str = new String("MM");
        System.out.println(str);// MM

        Date date = new Date(4534534534543L);
        System.out.println(date.toString());// Mon Sep 11 08:55:34 GMT+08:00 2113
    }
}
