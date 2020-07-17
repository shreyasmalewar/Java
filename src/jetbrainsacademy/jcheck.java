package jetbrainsacademy;

import java.util.Scanner;


public class jcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String str = scanner.nextLine();
        scanner.close();
        boolean jCheck = str.startsWith("j");
        boolean capJcheck = str.startsWith("J");
        
        if (jCheck == true || capJcheck == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}