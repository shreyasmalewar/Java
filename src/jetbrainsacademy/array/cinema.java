package jetbrainsacademy.array;

import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i ++) {
            for (int j = 0; j < col ; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        int count = 0;
        int j = 0;
        int emptyrow = 0;

        for (int i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    count = count + 1;
                    if (count == k) {
                        emptyrow = j;
                    }
                }
            }
            ++j;
        }

        if (emptyrow == k) {
            System.out.println(emptyrow + 1);
        } else {
            System.out.println(0);
        }
        

        scanner.close();
    }
}