package pracbasic;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")) {
            System.out.printf("Input: ");
            try {
                input = scanner.next().toLowerCase();
            } finally {
                scanner.close();
            }

            System.out.println(input);
        }
    }
}