package jetbrainsacademy.methods;

import java.util.Scanner;

public class division {

    public static double divide(long a, long b) {
        return (float) a / b;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        scanner.close();
        System.out.println(divide(a, b));
    }
}