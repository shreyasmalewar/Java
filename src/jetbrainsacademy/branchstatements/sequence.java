package jetbrainsacademy.branchstatements;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int counter = 0;
        scanner.close();

        if (number == 1) {
            System.out.println(1);
        }
        
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                if (counter < number) {
                    System.out.printf(i + " ");
                    counter++;
                }
            }
        }
    }
}
