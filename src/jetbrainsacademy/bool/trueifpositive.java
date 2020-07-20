package jetbrainsacademy.bool;

import java.util.Scanner;

public class trueifpositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a > 0 && b <= 0 && c <= 0 || 
            a <= 0 && b > 0 && c <= 0 || 
            a <= 0 && b <= 0 && c > 0) {
                
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}