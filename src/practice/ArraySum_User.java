package practice;

import java.util.Scanner;

class ArraySum_User {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Enter the elements:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Sum of array elements is:" + sum);
    }
}