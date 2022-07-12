package basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()
 * <p>
 * 例子：遍历100以内的所有的偶数
 * <p>
 * 问题：
 * 一：我们不能通过直接调用run()的方式启动线程
 * 二：再启动一个线程，遍历100以内的偶数。不可以还让已经start()的线程去执行。会报IllegalThreadStateException
 * 需要重新创建一个线程的对象
 */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

/**
 * 创建多线程的方式二：实现Runnable接口
 * 1. 创建一个实现了Runnable接口的类
 * 2. 实现类去实现Runnable中的抽象方法：run()
 * 3. 创建实现类的对象
 * 4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5. 通过Thread类的对象调用start()
 * <p>
 * <p>
 * 比较创建线程的两种方式。
 * 开发中：优先选择：实现Runnable接口的方式
 * 原因：1. 实现的方式没有类的单继承性的局限性
 * 2. 实现的方式更适合来处理多个线程有共享数据的情况。
 * <p>
 * 练习：public class Thread implements Runnable
 * 相同点：两种方式都需要重写run(),将线程要执行的逻辑声明在run()中。
 */
class MThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

/**
 * 创建线程的方式三：实现Callable接口。
 *
 * 如何理解实现Callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大？
 * 1. call()可以有返回值的
 * 2. call()可以抛出异常，被外面的操作捕获，获取异常的信息
 * 3. Callable是支持泛型的
 */
class NumThread implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i+=2) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }
}

public class CreateThread {
    public static void main(String[] args) {
        // 方式一
//        MyThread t1 = new MyThread();
//        t1.start();
//        MyThread t2 = new MyThread();
//        t2.start();
//        // 先跑主线程
//        for (int i = 0; i < 100; i += 2) {
//            System.out.println(Thread.currentThread().getName() + ":" + i + "***********main()************");
//        }

        // 方式二
//        MThread mThread = new MThread();
//        Thread t3 = new Thread(mThread);
//        t3.setName("线程1");
//        t3.start();
//
//        Thread t4 = new Thread(mThread);
//        t4.setName("线程2");
//        t4.start();

        // 方式三
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();

        try {
            Object sum = futureTask.get();
            System.out.println("总和为：" + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
