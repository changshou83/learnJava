package exer;

public class YanghuiAri {
    public static void main(String[] args) {
        int level = 10;
        int[][] matrix = new int[level][];

        for(int i = 0;i < matrix.length;i++) {
            matrix[i] = new int[i+1];

            matrix[i][0] = matrix[i][i] = 1;
            for(int j = 1;j < matrix[i].length - 1;j++) {
                matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
