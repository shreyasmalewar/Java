package jetbrainsacademy.branchstatements;

import java.util.Scanner;

public class bustour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int heightOfBridge;
        boolean crash = false;
        int i = 0;
        scanner.close();

        for (i = 0; i < numberOfBridges; i++) {
            heightOfBridge = scanner.nextInt();
            if (busHeight >= heightOfBridge) {
                crash = true;
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            } 
        }

        if (crash == false) {
            System.out.println("Will not crash");
        }

    }
}