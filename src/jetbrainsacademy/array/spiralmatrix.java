package jetbrainsacademy.array;

import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        spiralFill(n, matrix);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        scanner.close();
    }

    static void spiralFill(int n, int[][] matrix) {
        // Initialize value to be filled in matrix
        int val = 1;

        /*
         * k - starting row index l - starting column index n - ending row/column index
         */
        int k = 0, l = 0;

        while (k < n && l < n) {
            /*
             * Print the first row from the remaining rows
             */
            for (int i = l; i < n; ++i) {
                matrix[k][i] = val++;
            }
            k++;

            /*
             * Print the last column from the remaining columns
             */
            for (int i = k; i < n; ++i) {
                matrix[i][n - 1] = val++;
            }
            n--;

            /*
             * Print the last row from the remaining rows
             */
            if (k < n) {
                for (int i = n - 1; i >= l; --i) {
                    matrix[n - 1][i] = val++;
                }
                n--;
            }

            /*
             * Print the first column from the remaining columns
             */
            if (l < n) {
                for (int i = n - 1; i >= k; --i) {
                    matrix[i][l] = val++;
                }
                l++;
            }
        }
    }
}