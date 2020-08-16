package jetbrainsacademy;

import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cells: ");
        char[] xo = scanner.nextLine().toCharArray();
        //scanner.close();

        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println(String.format("| %c %c %c |", xo[i], xo[i+1], xo[i+2]));
        }
        System.out.println("---------");

        boolean empty = true;

        while (empty == true) {

            int x = 0;
            int y = 0;
            boolean perfectCoordinates = false;

            while (perfectCoordinates == false) {
                System.out.print(("Enter the coordinates: "));
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

    
            if (x == 1 && y == 3 && (xo[0] == ' ' || xo[0] == '_')) {
                xo[0] = 'X';
                empty = false;
            } else if (x == 2 && y == 3 && (xo[1] == ' ' || xo[1] == '_')) {
                xo[1] = 'X';
                empty = false;
            } else if (x == 3 && y == 3 && (xo[2] == ' ' || xo[2] == '_')) {
                xo[2] = 'X';
                empty = false;
            } else if (x == 1 && y == 2 && (xo[3] == ' ' || xo[3] == '_')) {
                xo[3] = 'X';
                empty = false;
            } else if (x == 2 && y == 2 && (xo[4] == ' ' || xo[4] == '_')) {
                xo[4] = 'X';
                empty = false;
            } else if (x == 3 && y == 2 && (xo[5] == ' ' || xo[5] == '_')) {
                xo[5] = 'X';
                empty = false;
            } else if (x == 1 && y == 1 && (xo[6] == ' ' || xo[6] == '_')) {
                xo[6] = 'X';
                empty = false;
            } else if (x == 2 && y == 1 && (xo[7] == ' ' || xo[7] == '_')) {
                xo[7] = 'X';
                empty = false;
            } else if (x == 3 && y == 1 && (xo[8] == ' ' || xo[8] == '_')) {
                xo[8] = 'X';
                empty = false;
            } else {
                System.out.println("This cell is occupied! Choose another one!");
                empty = true;
            }
        }
        scanner.close();


        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println(String.format("| %c %c %c |", xo[i], xo[i+1], xo[i+2]));
        }
        System.out.println("---------");


    }
}


/* 

        if (xo[0] == 'X' && xo[1] == 'O' && xo[2] == '_') {
            System.out.println("Impossible");
            return;
        }


        int xs = 0;
        int os = 0;
        int nullCounter = 0;
        boolean xwins = false;
        boolean owins = false;

        for (int i = 0; i < xo.length; i++) {
            if (xo[i] == 'O') {
                os = os + 1;
            } else if (xo[i] == 'X') {
                xs = xs + 1;
            } else if (xo[i] == ' ' || xo[i] == '_') {
                nullCounter = nullCounter + 1;
            }
        }

        // check winner horizontally
        for (int i = 0; i < xo.length; i+= 3) {
            if (xo[i] + xo[i+1] + xo[i+2] == 264) {
                xwins = true;
                break;
            } else if(xo[i] + xo[i+1] + xo[i+2] == 237) {
                owins = true;
                break;
            }
        }

        // check winner vertically
        for (int i = 0; i < 3; i++) {
            if (xo[i] + xo[i+3] + xo[i+6] == 264) {
                xwins = true;
                break;
            } else if (xo[i] + xo[i+3] + xo[i+6] == 237) {
                owins = true;
                break;
            }
        }

        // check winner right diagonal
        if (xo[0] + xo[4] + xo[8] == 264 || xo[2] + xo[4] + xo[6] == 264) {
            xwins = true;
        } else if (xo[0] + xo[4] + xo[8] == 237 || xo[2] + xo[4] + xo[6] == 237) {
            owins = true;
        }

        if (Math.abs(xs - os) > 1 && nullCounter > 1) {
            System.out.println("Impossible");
        } else if (xwins == false && owins == false && nullCounter > 1) {
            System.out.println("Game not finished");
        } else if (xs + os == 9 && nullCounter == 0 && xwins == false && owins == false) {
            System.out.println("Draw");
        } 

        if (xwins == true) {
            System.out.println("X wins");
        } else if (owins == true) {
            System.out.println("O wins");
        }


*/