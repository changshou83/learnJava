package basic.Security;

/**
 * 例子：创建三个窗口卖票，总票数为100张.使用实现Runnable接口的方式
 * <p>
 * 1.问题：卖票过程中，出现了重票、错票 -->出现了线程的安全问题
 * 2.问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票。
 * 3.如何解决：当一个线程a在操作ticket的时候，其他线程不能参与进来。直到线程a操作完ticket时，其他
 * 线程才可以开始操作ticket。这种情况即使线程a出现了阻塞，也不能被改变。
 * <p>
 * 4.在Java中，我们通过同步机制，来解决线程的安全问题。
 * 方式一：同步代码块
 * synchronized(同步监视器){
 * //需要被同步的代码
 * }
 * 说明：
 * 1.操作共享数据的代码，即为需要被同步的代码。
 * 2.共享数据：多个线程共同操作的变量。比如：ticket就是共享数据。
 * 3.同步监视器，俗称：**锁**。任何一个类的对象，都可以充当锁。
 * 要求：多个线程必须要共用同一把锁。
 * 补充：
 * 在实现Runnable接口创建多线程的方式中，我们可以考虑使用this充当同步监视器。
 * 在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器。
 * 方式二：同步方法，如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此方法声明同步的。
 * 关于同步方法的总结：
 * 1. 同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 * 2. 非静态的同步方法，同步监视器是：this
 * 静态的同步方法，同步监视器是：当前类本身
 * <p>
 * 5.同步的方式，解决了线程的安全问题。---好处
 * 操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低。 ---局限性
 */
public class ThreadSecurity {
    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

/*
 * 同步代码块
 */
class Window implements Runnable {
    //class Window extends Thread {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {// 此时的this:唯一的Window的对象
                //            synchronized (Window.class) {// 使用 Window.class 绑定唯一对象
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

/*
 * 同步方法
 */
//class Window implements Runnable {
//    //class Window extends Thread {
//    private int ticket = 100;
//
//    @Override
//    public void run() {
//        while (true) {
//            show();
//        }
//    }
//
//    private synchronized void show() {// 同步监视器：this
//        //    private static synchronized void show(){//同步监视器：Window.class
//        if (ticket > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
//            ticket--;
//        }
//    }
//}
