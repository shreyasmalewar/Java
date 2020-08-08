package jetbrainsacademy.array;

import java.util.Scanner;

public class symmetric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");

    }
}