package jetbrainsacademy.array;

import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfElements = scanner.nextInt();
        int[] numbers = new int[numberOfElements];
        int sum = 0;
    
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int lowerBound = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > lowerBound) {
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);
    }
}