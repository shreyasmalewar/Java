package jetbrainsacademy.bool;

import java.util.Scanner;

public class isbetween {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        Boolean isBetween = (a >= b && a <= c || (a >= c && a <= b));
        System.out.println(isBetween);
    }
}