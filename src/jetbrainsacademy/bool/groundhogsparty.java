package jetbrainsacademy.bool;

import java.util.Scanner;

public class groundhogsparty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCups = scanner.nextInt();
        Boolean isWeekend = scanner.nextBoolean();
        scanner.close();

        if (isWeekend == true && numberOfCups >= 10 && numberOfCups <= 20) {
            System.out.println(true);
        } else if (isWeekend == false && numberOfCups >= 15 && numberOfCups <= 25) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}