package DesignPattern;

/*
 * 单例设计模式：
 * 1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。
 *
 * 2. 如何实现？
 *   饿汉式：
 *   	坏处：对象加载时间过长。
 *   	好处：饿汉式是线程安全的
 *
 *   懒汉式：
 *      好处：延迟对象的创建。
 * 		目前的写法坏处：线程不安全。--->到多线程内容时，再修改

 */

public class SingleTon {
    public static void main(String[] args) {
        // 饿汉式
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);

        // 懒汉式
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);
    }
}

// 饿汉式
class Bank {
    //1.私有化类的构造器
    private Bank() {
    }

    //2.内部创建类的对象,要求此对象也必须声明为静态的
    private static final Bank instance = new Bank();

    //3.提供公共的静态的方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    }
}

// 懒汉式
class Order {
    //1.私有化类的构造器
    private Order() {
    }

    //2.声明当前类对象，没有初始化,此对象也必须声明为static的
    private static Order instance = null;

    //3.声明public、static的返回当前类对象的方法
//    public static Order getInstance() {
//        if (instance == null) {
//            instance = new Order();
//        }
//        return instance;
//    }
//    线程安全的懒汉式
    public static Order getInstance() {
        if (instance == null) {
            synchronized (Order.class) {
                if (instance == null) {
                    instance = new Order();
                }
            }
        }
        return instance;
    }
}
