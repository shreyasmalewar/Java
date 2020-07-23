package jetbrainsacademy.conditionalstatements;

import java.util.Scanner;

public class iftriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        scanner.close();

        if (side1 < side2 + side3 && side2 < side3 + side1 && side3 < side2 + side1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}