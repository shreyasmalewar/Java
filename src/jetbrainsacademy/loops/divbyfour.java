package jetbrainsacademy.loops;

import java.util.Scanner;

public class divbyfour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highest = 0; 
        int newnum = 0;
        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            int number = scanner.nextInt();
            if (number % 4 == 0) {
                newnum = number;

                if (newnum > highest) {
                    highest = newnum;
                } 
            }
        }
        scanner.close();
        System.out.println(highest);

        
    }
}