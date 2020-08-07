package jetbrainsacademy.array;

import java.util.Scanner;

public class symmetric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j< n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
    }
}