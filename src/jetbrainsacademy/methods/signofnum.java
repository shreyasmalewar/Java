// https://hyperskill.org/learn/step/2730

package jetbrainsacademy.methods;

import java.util.Scanner;

public class signofnum {

    public static int sign(int number) {
        if (number >= 1) {
            return 1;
        } else if (number <= -1) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        scanner.close();
        System.out.println(sign(n));
    }
}