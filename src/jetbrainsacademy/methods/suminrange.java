package jetbrainsacademy.methods;

import java.util.Scanner;

public class suminrange {

    public static long sumInRange(long from, long to) {
        long sum = 0;
        for (int i = (int) from; i <= to; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        long from = scanner.nextInt();
        long to = scanner.nextInt();
        scanner.close();

        System.out.println(sumInRange(from, to));
    } 
}