package basic.func;

public class Overload {
    // 1. 如下的三个方法构成重载
    public void mOL(int i){
        System.out.println(i * i);
    }
    public void mOL(int i, int j){
        System.out.println(i * j);
    }
    public void mOL(String s){
        System.out.println(s);
    }

    // 2.如下的三个方法构成重载
    public int max(int i,int j){
        return Math.max(i, j);
    }
    public double max(double d1,double d2){
        return Math.max(d1, d2);
    }
    public double max(double d1,double d2,double d3){
        double max = Math.max(d1, d2);
        return Math.max(max, d3);
    }
}
