package jetbrainsacademy;

import java.util.Scanner;

public class finaltictac {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        displayBlankBoard();

        

        enterElement();


    }

    static void displayBlankBoard() {
        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println(String.format("|       |"));
        }
        System.out.println("---------");
    }

    static void enterElement() {
        boolean perfectCoordinates = false;

        while (perfectCoordinates == false) {
            
            System.out.print("Enter cells: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

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
   
    }
}