package basic;

/**
 * @author 长寿
 */
public class ArrayBasic {
    public static void main(String[] args) {
        /*
         * ⑤ 数组元素的默认初始化值
         * 		> 数组元素是整型：0
         * 		> 数组元素是浮点型：0.0
         * 		> 数组元素是char型：0或'\u0000'，而非'0'
         * 		> 数组元素是boolean型：false
         *
         * 		> 数组元素是引用数据类型：null
         */

        // 一维数组
        int[] ids = new int[]{1, 2, 3, 4};
        String[] names = new String[5];

        int len = ids.length;
        System.out.println(len);

        // 二维数组
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        String[][] arr2 = new String[3][2];

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }
    private static int getRandom(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
    private static int getMin(int[] arr) {
        int minValue = arr[0];
        for(int value : arr){
            if(minValue > value){
                minValue = value;
            }
        }

        return minValue;
    }
    private static int getMax(int[] arr) {
        int maxValue = arr[0];
        for(int value : arr){
            if(maxValue < value){
                maxValue = value;
            }
        }

        return maxValue;
    }
    private static int getSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }

        return sum;
    }
    private static int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }
    private static int[] copy(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
    private static void traverse(int[] arr) {
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }
}
