package jetbrainsacademy;


import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter cells: ");
        String element = scanner.next();
        scanner.close();

        System.out.println("---------");
        System.out.printf("| ");
        for (int i = 0; i <= 2; i++) {
            System.out.print(element.charAt(i) + " ");
        }
        System.out.print("|");

        System.out.println();

        System.out.printf("| ");
        for (int i = 3; i <= 5; i++) {
            System.out.print(element.charAt(i) + " ");
        }
        System.out.printf("|");

        System.out.println();

        System.out.printf("| ");
        for (int i = 6; i <= 8; i++) {
            System.out.print(element.charAt(i) + " ");
        }
        System.out.printf("|");

        System.out.println();
        System.out.println("---------");
    }
}