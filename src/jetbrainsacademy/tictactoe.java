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
        boolean xwins = false;
        boolean owins = false;

        for (int i = 0; i < xo.length; i++) {
            if (xo[i] == 'O') {
                os = os + 1;
            } else if (xo[i] == 'X') {
                xs = xs + 1;
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
        for (int i = 0; i < 1; i++) {
            if (xo[i] + xo[i + 4] + xo[i + 8] == 264) {
                xwins = true;
                break;
            } else if (xo[i] + xo[i + 4] + xo[i + 8] == 237) {
                owins = true;
                break;
            }
        }

        // check winner left diagonal
        for (int i = 2; i < 3; i++) {
            if (xo[i] + xo[i + 2] + xo[i + 6] == 264) {
                xwins = true;
                break;
            } else if (xo[i] + xo[i + 2] + xo[i + 6] == 237) {
                owins = true;
                break;
            }
        }


        if (xwins == true) {
            System.out.println("X wins");
        } else if (owins == true) {
            System.out.println("O wins");
        }

    }
}


/*
        // check winner right diagonal
        for (int i = 2; i < 3; i++) {
            if (xo[i] + xo[i + 2] + xo[i + 4] == 264) {
                System.out.println("X wins");
                break;
            } else if (xo[i] + xo[i + 2] + xo[i + 4] == 237) {
                System.out.println("O wins");
                break;
            }
        }

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
*/