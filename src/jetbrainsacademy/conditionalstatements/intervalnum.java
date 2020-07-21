package jetbrainsacademy.conditionalstatements;

import java.util.Scanner;

public class intervalnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if ((-15 < number && number <= 12) || (14 < number && number < 17) || (19 <= number)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}