package jetbrainsacademy.methods;

import java.util.Scanner;

public class integerpart {

    public static int extractInt(double d) {
        return (int) d;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        
        final double d = scanner.nextDouble();
        scanner.close();

        System.out.println(extractInt(d));
    }
}