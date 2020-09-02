package jetbrainsacademy.miscallenous;

import java.util.Scanner;

public class sizeofparts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parts = scanner.nextInt();
        int eachPart;
        int small = 0;
        int large = 0;
        int perfect = 0;

        for (int i = 0; i < parts; i++) {
            eachPart = scanner.nextInt();

            if (eachPart == 0) {
                perfect = perfect + 1;
            } else if (eachPart == 1) {
                large = large + 1;
            } else {
                small = small + 1;
            }
        }

        System.out.printf("%d %d %d", perfect, large, small);
        scanner.close();
    }
}