package jetbrainsacademy.array;

import java.util.Scanner;

public class swapindex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        // insert elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("elements are:");
       // disp elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(array[i][j] + " ");
            }System.out.println();
        }

        swap(n, m, array);
        
        
        scanner.close();
    }

    static void swap (int n, int m, int[][] array) {
        System.out.println("function entered");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("input complete");
        scanner.close();

        for (int i = 0; i < m; i++) {
            int temp = array[i][x];
            array[i][x] = array[i][y];
            array[i][y] = temp;
        }

        System.out.println("printing array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(array[i][j] + " ");
            }System.out.println();
        }

    }
}