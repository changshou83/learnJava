package exer;

public class Reverse {
    public static void main(String[] args) {
        String[] arr = { "JJ", "DD", "MM", "BB", "GG", "AA" };

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
