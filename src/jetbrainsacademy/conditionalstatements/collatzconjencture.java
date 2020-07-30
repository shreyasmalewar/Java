package jetbrainsacademy.conditionalstatements;

import java.util.Scanner;


public class collatzconjencture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

        while (number != 1) {

            System.out.printf(number + " ");

            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }
        }
        if (number == 1) {
            System.out.println(1);
        }
    }
}