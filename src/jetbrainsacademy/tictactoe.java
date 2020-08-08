package jetbrainsacademy;


import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cells: ");
        char[] xo = scanner.nextLine().toCharArray();
        scanner.close();

        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println(String.format("| %c %c %c |", xo[i], xo[i+1], xo[i+2]));
        }
        System.out.println("---------");
    }
}