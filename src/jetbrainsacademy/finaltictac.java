package jetbrainsacademy;

import java.util.Scanner;

public class finaltictac {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        // display blank board
        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println(String.format("|       |"));
        }
        System.out.println("---------");


        // enter element
        boolean perfectCoordinates = false;

        while (perfectCoordinates == false) {
            
            System.out.print("Enter cells: ");
            x = scanner.nextInt();
            y = scanner.nextInt();

            if (1 <= x && x <= 3 && 1 <= y && y <= 3) {
                perfectCoordinates = true;
            } else if (Character.isLetter(x) || Character.isLetter(y)) {
                System.out.println("You should enter numbers!");
                perfectCoordinates = false;
            } else {
                System.out.println("Coordinates should be from 1 to 3!");
                perfectCoordinates = false;
            } 
        }

        char[] xo = "         ".toCharArray();

        if (x == 1 && y == 3 && xo[0] == ' ') {
            xo[0] = 'X';
        } else if (x == 2 && y == 3 && xo[1] == ' ') {
            xo[1] = 'X';
        } else if (x == 3 && y == 3 && xo[2] == ' ') {
            xo[2] = 'X';
        } else if (x == 1 && y == 2 && xo[3] == ' ') {
            xo[3] = 'X';
        } else if (x == 2 && y == 2 && xo[4] == ' ') {
            xo[4] = 'X';
        } else if (x == 3 && y == 2 && xo[5] == ' ') {
            xo[5] = 'X';
        } else if (x == 1 && y == 1 && xo[6] == ' ') {
            xo[6] = 'X';
        } else if (x == 2 && y == 1 && xo[7] == ' ') {
            xo[7] = 'X';
        } else if (x == 3 && y == 1 && xo[8] == ' ') {
            xo[8] = 'X';
        }

        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println(String.format("| %c %c %c |", xo[i], xo[i+1], xo[i+2]));
        }
        System.out.println("---------");
    }

}