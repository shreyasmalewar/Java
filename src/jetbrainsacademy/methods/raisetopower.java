package jetbrainsacademy.methods;

import java.util.Scanner;

public class raisetopower {

    public static long power(int n, int m) {
        return (long) Math.pow(n, m);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        scanner.close();

        System.out.println(power(n, m));
    }
}