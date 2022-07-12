package basic;

import java.util.concurrent.*;

/**
 * 创建线程的方式四：使用线程池
 * <p>
 * 好处：
 * 1.提高响应速度（减少了创建新线程的时间）
 * 2.降低资源消耗（重复利用线程池中线程，不需要每次都创建）
 * 3.便于线程管理
 * corePoolSize：核心池的大小
 * maximumPoolSize：最大线程数
 * keepAliveTime：线程没有任务时最多保持多长时间后会终止
 * <p>
 * <p>
 * 面试题：创建多线程有几种方式？四种！
 * 1.runnable
 * 2.extends thread
 * 3.callable
 * 4.threadPool
 */

class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

class OddThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        //1. 提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor pool = (ThreadPoolExecutor) service;
        //设置线程池的属性
        System.out.println(service.getClass());
        pool.setCorePoolSize(15);
        pool.setKeepAliveTime(1, TimeUnit.SECONDS);


        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new EvenThread());//适合适用于Runnable
        service.execute(new OddThread());//适合适用于Runnable
        //        service.submit(Callable callable);//适合使用于Callable

        //3.关闭连接池
        service.shutdown();
    }
}
