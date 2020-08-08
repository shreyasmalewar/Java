package jetbrainsacademy.array;

import java.util.Scanner;

public class maxinmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int r = 0;
        int c = 0;

        int[][] matrix = new int[row][col];

        int max = -300;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    r = i;
                    c = j;
                }
            }
        }

        System.out.println(r + " " + c);

        scanner.close();
    }
}