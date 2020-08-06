package jetbrainsacademy.array;

import java.util.Scanner;

public class maxproduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxProduct = 0;
        int product = 0;
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        maxProduct = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            product = numbers[i] * numbers[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }  
        }
        System.out.println(product);
    }
}