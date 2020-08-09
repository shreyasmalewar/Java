package jetbrainsacademy.array;

import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int value = 1;
        int minCol = 0;
        int minRow = 0;
        int maxRow = n - 1;
        int maxCol = n -1;

        while (value <= n * n) {

            for (int i = minCol; i <= maxCol; i++) {
                matrix[minRow][i] = value;
                value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
                matrix[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol - 1; i >= minCol; i--) {
                matrix[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                matrix[i][minCol] = value;
                value++;
            }

            minRow++;
            minCol++;
            maxRow--;
            maxCol--;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}