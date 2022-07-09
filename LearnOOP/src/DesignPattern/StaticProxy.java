package DesignPattern;

public class StaticProxy {
    public static void main(String[] args) {
        Broker star = new Broker(new RealStar());
        star.confer();
        star.signContract();
        star.bookTicket();
        star.sing();
        star.collectMoney();
    }
}

interface Star {
    void confer();// 面谈
    void signContract();// 签合同
    void bookTicket();// 订票
    void sing();// 唱歌
    void collectMoney();// 收钱
}
//被代理类
class RealStar implements Star {
    public void confer() {
    }

    public void signContract() {
    }

    public void bookTicket() {
    }

    public void sing() {
        System.out.println("明星：歌唱~~~");
    }

    public void collectMoney() {
    }
}

//代理类
class Broker implements Star {
    private Star real;

    public Broker(Star real) {
        this.real = real;
    }

    public void confer() {
        System.out.println("经纪人面谈");
    }

    public void signContract() {
        System.out.println("经纪人签合同");
    }

    public void bookTicket() {
        System.out.println("经纪人订票");
    }

    public void sing() {
        real.sing();
    }

    public void collectMoney() {
        System.out.println("经纪人收钱");
    }
}
