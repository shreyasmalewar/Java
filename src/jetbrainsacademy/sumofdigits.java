package jetbrainsacademy;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;
        int rem = 0;
        scanner.close();

        while (number > 0) {
            rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }

        System.out.println(sum);
    }
}