package jetbrainsacademy;

import java.util.Scanner;

public class bot {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        greet("Aid", "2020");
        remindName();
        guessAge();
        count();
        end();
    }

    static void greet (String assistantName, String birthYear) {
        System.out.println("Hello! My name is" + assistantName + ".");
        System.out.println("I was created in 2018" + assistantName + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName () {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge () {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainderThree = scanner.nextInt();
        int remainderFive = scanner.nextInt();
        int remainderSeven = scanner.nextInt();
        
        int age = (remainderThree * 70 + remainderFive * 21 + remainderSeven * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count () {
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int count = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= count; i++) {
            System.out.println(i + "\n");
        }
    }

    static void test() {
        //mycode
    }

    static void end() {
        System.out.println("Completed, have a nice day!");
    }
}