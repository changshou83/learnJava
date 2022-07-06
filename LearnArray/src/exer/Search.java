package exer;

public class Search {
    public static void main(String[] args) {
        linearSearch();
    }

    private static void linearSearch() {
        String[] list = new String[]{"JJ", "DD", "MM", "BB", "GG", "AA"};

        String dest = "BB";

        boolean notFound = true;

        for (int i = 0; i < list.length; i++) {
            boolean isExist = dest.equals(list[i]);
            if (!isExist) {
                continue;
            }

            System.out.println("找到了指定的元素，位置为：" + i);
            notFound = false;
            break;
        }

        if (notFound) {
            System.out.println("很遗憾，没有找到的啦！");
        }
    }
    private static void binarySearch() {
        int[] arr = new int[]{-98,-34,2,34,54,66,79,105,210,333};

        int dest = -34;
        int head = 0;
        int end = arr.length - 1;

        boolean notFound = true;

        while(head <= end){
            int middle = (head + end) / 2;
            if(dest == arr[middle]){
                System.out.println("找到了指定的元素，位置为：" + middle);
                notFound = false;
                break;
            }else if(arr[middle] > dest){
                end = middle - 1;
            }else {
                //arr2[middle] < dest1
                head = middle + 1;
            }
        }

        if(notFound){
            System.out.println("很遗憾，没有找到的啦！");
        }
    }
}
