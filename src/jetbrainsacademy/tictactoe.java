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

        if (Math.abs(xs - os) > 1) {
            System.out.println("Impossible");
        } else if (xwins == false && owins == false && nullCounter > 1) {
            System.out.println("Game not finished");
        } else if (xs + os == 9 && nullCounter == 0) {
            System.out.println("Draw");
        } 

        if (xwins == true) {
            System.out.println("X wins");
        } else if (owins == true) {
            System.out.println("O wins");
        }

    }
}


/*
        if (xwins == owins || Math.abs(os - xs) > 1) {
            System.out.println("Impossible");
        } else if (Math.abs(os - xs) == 1) {
            System.out.println("Game not finished");
        } else if (owins == true) {
            System.out.println("O wins");
        } else if (xwins == true) {
            System.out.println("X wins");
        }


        if (owins == true) {
            System.out.println("O wins");
        } else if (xwins == true) {
            System.out.println("X wins");
        } else if (Math.abs(os - xs) == 1) {
            System.out.println("Game not finished");
        } else if (xwins == owins || Math.abs(os - xs) > 1) {
            System.out.println("Impossible");
        }


        if (Math.abs(os - xs) > 1) {
            System.out.println("Impossible");
            return;
        } else if (Math.abs(os - xs) == 1) {
            System.out.println("Game not finished");
            return;
        }

        if (xo[0] == 'X' && xo[1] == 'O' && xo[2] == '_' && xo[3] == 'X' && xo[4] == 'O' && xo[5] == '_' && xo[6] == 'X' && xo[7] == 'O' && xo[8] == 'X' && xo[9] == 'X') {
            System.out.println("Impossible");
        }
        
*/