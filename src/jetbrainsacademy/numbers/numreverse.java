package jetbrainsacademy.numbers;

import java.util.Scanner;

public class numreverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int remainder;
        int reverse = 0;
    
        scanner.close();

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println(reverse);
            
    }
}