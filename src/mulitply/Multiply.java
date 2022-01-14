package mulitply;

import java.util.Arrays;

public class Multiply {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}
        };
        multiplymatrix(matrix);
        for (int[] matrix1 : matrix) {
            System.out.println(Arrays.toString(matrix1));
        }
    }
    public static void multiplymatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 != 0 && matrix[i][j] % 2 != 0) {
                    matrix[i][j] *= 2;
                } else if (i % 2 == 0 && matrix[i][j] % 2 == 0) {
                    matrix[i][j] *= 2;
                }
            }
        }
    }
}