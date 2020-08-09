package jetbrainsacademy.miscallenous;

import java.util.Scanner;

public class problemofday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int[] array = new int[numOfElements];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int element = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count = count + 1;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}