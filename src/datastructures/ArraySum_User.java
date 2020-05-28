//Program to calculate sum of 1D array

package datastructures;

import java.util.Scanner;

class ArraySum_User {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        //Array innitilization
        int[] array = new int[10];
        int sum = 0;

        //Printing inserted elements
        System.out.println("Enter the element(s)");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        for (int num : array) {
            sum = sum + num;
        }

        //Printing sum
        System.out.println("Sum of array elements is:" + sum);
    }
}