package jetbrainsacademy.conditionalstatements;

import java.util.Scanner;

public class chocolatedivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if (N % K == 0 || M % K == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}