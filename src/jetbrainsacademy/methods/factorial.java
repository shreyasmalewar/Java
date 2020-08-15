// https://hyperskill.org/learn/step/2728

package jetbrainsacademy.methods;

import java.util.Scanner;

public class factorial {

    public static long factorialFunc(long n) {
        long fact = 1;
        for (int i = 0; i < n; i++) {
            fact = fact * i + fact; 
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        scanner.close();

        System.out.println(factorialFunc(n));
    }
}