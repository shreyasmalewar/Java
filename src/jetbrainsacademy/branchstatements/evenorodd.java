package jetbrainsacademy.branchstatements;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (scanner.hasNext()) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }       
        }
        scanner.close();
    }
}