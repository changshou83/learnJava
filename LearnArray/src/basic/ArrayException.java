package basic;

public class ArrayException {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};

        /* 越界 */
        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
        // System.out.println(array[-2]);

        /* 空指针 */
        // 情况一：
        // int[] arr1 = new int[]{1,2,3};
        // arr1 = null;
        // System.out.println(arr1[0]);

        // 情况二：
        // int[][] arr2 = new int[4][];
        // System.out.println(arr2[0][0]);

        // 情况三：
        // String[] arr3 = new String[]{"AA","BB","CC"};
        // arr3[0] = null;
        // System.out.println(arr3[0].toString());
    }
}
