package basic.func;

public class Recursion {
    public static void main(String[] args) {
        // 例1：计算1-100之间所有自然数的和
        Recursion recursion = new Recursion();
        int sum1 = recursion.getSum(100);
        System.out.println(sum1);

        System.out.println("*****************");
        int value = recursion.f(10);
        System.out.println(value);

    }

    /**
     * 计算1-n之间所有自然数的和
     * @param n 最大值n
     * @return 和
     */
    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    /**
     * 计算n的阶乘
     * @param n n
     * @return 阶乘
     */
    public int getSum1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum1(n - 1);
        }
    }

    //例3：已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),
    //其中n是大于0的整数，求f(10)的值。
    public int f(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else{
            //			return f(n + 2) - 2 * f(n + 1);
            return 2*f(n - 1) + f(n - 2);
        }
    }

    //例4：斐波那契数列

    //例5：汉诺塔问题

    //例6：快排
}
