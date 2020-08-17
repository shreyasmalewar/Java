package jetbrainsacademy.miscallenous;

import java.util.Scanner;

public class sumtillzero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;

        while (scanner.hasNext()) {
            numbers = scanner.nextInt();
            if (numbers == 0) {
                System.out.println(sum);
                break;
            } else {
                sum = sum + numbers;
            }
        }
        scanner.close();

        System.out.println(numbers);
    }
}