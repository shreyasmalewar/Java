package jetbrainsacademy.loops;

import java.util.Scanner;

public class SquareofNarurals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int i = 1;
        scanner.close();

        while (i * i <= number) {
            System.out.println(i * i);
            i++;
        }
    }
}