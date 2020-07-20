package jetbrainsacademy.bool;

import java.util.Scanner;

public class checkequal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a == b || a == c || b == c) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}