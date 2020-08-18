package jetbrainsacademy;

import java.util.Scanner;

public class finaltictac {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int stepCounter = 0;
        char inputValue;
        char[] xo = "         ".toCharArray();  //9 elements

        displayBoard(xo);

        // enter element
        boolean foundWinner = false;
        while (foundWinner != true) {

            boolean perfectCoordinates = false;

            while (perfectCoordinates == false) {

                System.out.print("Enter the coordinates: ");
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

                if (x == 1 && y == 3 && xo[0] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    perfectCoordinates = false;
                } else if (x == 2 && y == 3 && xo[1] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    perfectCoordinates = false;
                } else if (x == 3 && y == 3 && xo[2] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    perfectCoordinates = false;
                } else if (x == 1 && y == 2 && xo[3] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    perfectCoordinates = false;
                } else if (x == 2 && y == 2 && xo[4] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    perfectCoordinates = false;
                } else if (x == 3 && y == 2 && xo[5] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    perfectCoordinates = false;
                } else if (x == 1 && y == 1 && xo[6] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    perfectCoordinates = false;
                } else if (x == 2 && y == 1 && xo[7] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    perfectCoordinates = false;
                    stepCounter++;
                } else if (x == 3 && y == 1 && xo[8] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    perfectCoordinates = false;
                }
            }

            if (stepCounter % 2 == 0) {
                inputValue = 'X';
            } else {
                inputValue = 'O';
            }

            if (x == 1 && y == 3 && xo[0] == ' ') {
                xo[0] = inputValue;
                stepCounter++;
            } else if (x == 2 && y == 3 && xo[1] == ' ') {
                xo[1] = inputValue;
                stepCounter++;
            } else if (x == 3 && y == 3 && xo[2] == ' ') {
                xo[2] = inputValue;
                stepCounter++;
            } else if (x == 1 && y == 2 && xo[3] == ' ') {
                xo[3] = inputValue;
                stepCounter++;
            } else if (x == 2 && y == 2 && xo[4] == ' ') {
                xo[4] = inputValue;
                stepCounter++;
            } else if (x == 3 && y == 2 && xo[5] == ' ') {
                xo[5] = inputValue;
                stepCounter++;
            } else if (x == 1 && y == 1 && xo[6] == ' ') {
                xo[6] = inputValue;
                stepCounter++;
            } else if (x == 2 && y == 1 && xo[7] == ' ') {
                xo[7] = inputValue;
                stepCounter++;
            } else if (x == 3 && y == 1 && xo[8] == ' ') {
                xo[8] = inputValue;
                stepCounter++;
            }


            displayBoard(xo);

            boolean winner = checkWinner(xo);
            if (winner == true) {
                foundWinner = true;
                break;
            } else {
                continue;
            }
        }
    }

    // display board
    static void displayBoard(char xo[]) {
        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println(String.format("| %c %c %c |", xo[i], xo[i+1], xo[i+2]));
        }
        System.out.println("---------");

    }

    // to check winner
    static boolean checkWinner(char[] xo) {
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

        boolean winner = false;
        // check winner right diagonal
        if (xo[0] + xo[4] + xo[8] == 264 || xo[2] + xo[4] + xo[6] == 264) {
            xwins = true;
        } else if (xo[0] + xo[4] + xo[8] == 237 || xo[2] + xo[4] + xo[6] == 237) {
            owins = true;
        }

        if (xs + os == 9 && nullCounter == 0 && xwins == false && owins == false) {
            winner = true;
            System.out.println("Draw");
        } 

        
        if (xwins == true) {
            System.out.println("X wins");
            winner = true;
        } else if (owins == true) {
            System.out.println("O wins");
            winner = true;
        }

        return winner;
    }
}