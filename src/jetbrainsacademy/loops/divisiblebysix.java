package jetbrainsacademy.loops;

import java.util.Scanner;

public class divisiblebysix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                sum = sum + number;
            }
        }
        scanner.close();
        System.out.println(sum);

        
    }
}