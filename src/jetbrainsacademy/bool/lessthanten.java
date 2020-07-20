package jetbrainsacademy.bool;

import java.util.Scanner;

public class lessthanten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

        boolean lessthan10 = number < 10;

        System.out.println(lessthan10);
    }
}