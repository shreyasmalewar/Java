package jetbrainsacademy.array;

import java.util.Scanner;

public class maxinmatrix {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int iMax = 0;
        int jMax = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[iMax][jMax] < matrix[i][j]) {
                    iMax = i;
                    jMax = j;
                }
            }
        }

        System.out.println(iMax + " " + jMax);
        scanner.close();
    }
}