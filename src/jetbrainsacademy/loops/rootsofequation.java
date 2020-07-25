package jetbrainsacademy.loops;

import java.util.Scanner;

public class rootsofequation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        for (int x = 1; x < 1000; x++) {
            float result = a * x^2 + b * x^1 + d;
            //System.out.println(result * -14);
            if(result * -1 == 0) {
                System.out.println(x);
            }
        }
    }
}