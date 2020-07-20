package jetbrainsacademy.bool;

import java.util.Scanner;

public class heightwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        scanner.close();

        if (h1 == h2 && h2 == h3 && h1 == h3)
            System.out.println(true);

        else if (h2 >= h1 && h2 <= h3)
            System.out.println(true);

        else if (h2 <= h1 && h2 >= h3)
            System.out.println(true);

        else 
            System.out.println(false);
    }
}