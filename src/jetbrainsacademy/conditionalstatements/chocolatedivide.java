package jetbrainsacademy.conditionalstatements;

import java.util.Scanner;

public class chocolatedivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (k % n == 0 && (k / n < m) || k % m == 0 && (k / m < n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}