package jetbrainsacademy.conditionalstatements;

import java.util.Scanner;

public class symetricalnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

        int n1 = number % 10; //for fourth digit
        int n2 = (number / 10) % 10; //for third digit
        int n3 = (number / 100) % 10; //for second digit
        int n4 = (number / 1000) % 10;

        if (n1 == n4 && n2 == n3) {
            System.out.println(1);
        } else {
            System.out.println(404);
        }
    }
}