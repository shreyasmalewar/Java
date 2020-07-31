package jetbrainsacademy.loops;

import java.util.Scanner;

public class divbyfourwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biggest = 0;
        int newnums = 0; //user input
        int i = 0; //loop variable
        int n = scanner.nextInt();


        while (i < n) {
            newnums = scanner.nextInt();

            if (newnums % 4 == 0 && biggest < newnums) {
                    biggest = newnums;
                
            }

            i++;
        }

        scanner.close();
        System.out.println(biggest);

    }
}