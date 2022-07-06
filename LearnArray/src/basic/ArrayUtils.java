package basic;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4};
        int[] array2 = new int[]{1,2,3,4};
        int[] array3 = new int[]{-98,-34,2,34,54,66,79,105,210,333};

        /* boolean Array.equals(int[] a, int[] b) */
        boolean isEquals = Arrays.equals(array1, array2);
        System.out.println(isEquals);

        /* String  Array.toString(int[] a) */
        System.out.println(Arrays.toString(array1));

        /* void    Array.fill(int[] a, int val) */
        Arrays.fill(array1, 10);
        System.out.println(Arrays.toString(array1));

        /* void    Array.sort(int[] a) */
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        /* int     Array.binarySearch(int[] a, int key) */
        int index = Arrays.binarySearch(array3, 210);
        if(index >= 0) {
            System.out.println(index);
        } else {
            System.out.println("未找到");
        }
    }
}
