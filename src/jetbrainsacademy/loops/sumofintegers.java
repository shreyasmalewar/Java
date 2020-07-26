//https://hyperskill.org/learn/step/2187

package jetbrainsacademy.loops;

import java.util.Scanner;

public class sumofintegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        scanner.close();

        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}