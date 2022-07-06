package exer;

public class QuickSort {
    public static void main(String[] args) {
        int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));

        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }

    public static void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }

    private static void subSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;

            while (true) {
                while (low < end && data[++low] - base <= 0)
                    ;
                while (high > start && data[--high] - base >= 0)
                    ;
                if (low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            swap(data, start, high);

            // 递归调用
            subSort(data, start, high - 1);
            subSort(data, high + 1, end);
        }
    }
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
