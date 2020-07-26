//https://hyperskill.org/learn/step/2163

package jetbrainsacademy.conditionalstatements;

import java.util.Scanner;

public class ifpositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}