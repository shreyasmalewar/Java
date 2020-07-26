package jetbrainsacademy;

import java.util.Scanner;

public class bot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        // reading a name
        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int remainderThree = scanner.nextInt();
        int remainderFive = scanner.nextInt();
        int remainderSeven = scanner.nextInt();
        
        
        int age = (remainderThree * 70 + remainderFive * 21 + remainderSeven * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        //counting ability
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int count = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= count; i++) {
            System.out.println(i + "\n");
        }

        System.out.println("Completed, have a nice day!");
    }
}