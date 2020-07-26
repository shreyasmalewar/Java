//https://hyperskill.org/learn/step/2742

package jetbrainsacademy.loops;

import java.util.Scanner;

public class productofintegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long product = 1;

        scanner.close();

        for (int i = a; i < b; i++) {
            product = product * i;
        }
        
        System.out.println(product);
    }
}