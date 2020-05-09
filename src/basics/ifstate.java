package basics;

import java.util.Scanner;

public class ifstate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a ==b)
        {
            System.out.printf("%d is equal to %d", a, b);
        }

        else
        {
            System.out.printf("%d is not equal to %d", a, b);
        }
    }
}