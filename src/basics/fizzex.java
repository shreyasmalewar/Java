package basics;

import java.util.Scanner;

public class fizzex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Number: ");

        try {
            number = scanner.nextInt();
        } finally {
            scanner.close();
        }

        if (number % 5 == 0)
            System.out.println("Fizz");

        else if (number % 3 == 0)
            System.out.println("Buzz");

        else if (number % 5 == 0)
            System.out.println("Fizzbuzz");

        else
            System.out.println(number);
    }
}