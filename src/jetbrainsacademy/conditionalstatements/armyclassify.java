//https://hyperskill.org/learn/step/2735

package jetbrainsacademy.conditionalstatements;

import java.util.Scanner;

public class armyclassify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSoliders = scanner.nextInt();
        scanner.close();

        if (numberOfSoliders < 1) {
            System.out.println("no army");
        } else if (numberOfSoliders >= 1 && numberOfSoliders <= 19) {
            System.out.println("pack");
        } else if (numberOfSoliders >= 20 && numberOfSoliders <= 249) {
            System.out.println("throng");
        } else if (numberOfSoliders >= 250 && numberOfSoliders <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}