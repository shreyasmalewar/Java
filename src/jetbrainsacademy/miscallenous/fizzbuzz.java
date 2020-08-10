package jetbrainsacademy.miscallenous;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = scanner.nextInt();
        int lastNumber = scanner.nextInt();

        for (int i = firstNumber; i <= lastNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}