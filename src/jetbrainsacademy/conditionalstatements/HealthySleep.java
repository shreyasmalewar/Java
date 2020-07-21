package jetbrainsacademy.conditionalstatements;

import java.util.Scanner;

public class HealthySleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c < a) {
            System.out.println("Deficiency");
        } else if (c > b) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}