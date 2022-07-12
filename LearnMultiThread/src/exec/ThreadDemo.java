package exec;

/**
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 *
 */

public class ThreadDemo {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();

        odd.start();
        even.start();
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        for(int i = 1;i < 100;i+=2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class EvenThread extends Thread {
    @Override
    public void run() {
        for(int i = 0;i < 100;i+=2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
