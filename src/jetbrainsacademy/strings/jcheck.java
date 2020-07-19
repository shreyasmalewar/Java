package jetbrainsacademy.strings;

import java.util.Scanner;


public class jcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String str = scanner.nextLine();
        scanner.close();
        boolean jCheck = str.startsWith("j"); //for lower case j
        boolean capJcheck = str.startsWith("J"); //for upper case (J)
        
        if (jCheck == true || capJcheck == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}