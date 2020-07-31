package jetbrainsacademy.branchstatements;

import java.util.Scanner;

public class integerbarrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        while (scanner.hasNext()) {
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println(sum);
                break;
            } else {
                sum = sum + number;
            }

            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }     
        }
        scanner.close();
    }
}