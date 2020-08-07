package jetbrainsacademy.array;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int num = scanner.nextInt();
        scanner.close();
        boolean contains = false;

        for (int i = 0; i < numbers.length && !contains; i++) {
            if (numbers[i] == num) {
                contains = true;
            }
        }

        System.out.println(contains);
    }
}