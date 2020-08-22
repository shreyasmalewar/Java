package jetbrainsacademy;

import java.util.Scanner;

public class CoffeeMachine {
    final static Scanner scanner = new Scanner(System.in);;
    public static void main(String[] args) {


        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();

        System.out.println("How many cups of coffee do you want to make: ");
        int numberOfCups = scanner.nextInt();
        scanner.close();

        if (water < 200 || milk < 50 || coffeeBeans < 15) {
            System.out.println("No, I can make only 0 cup(s) of coffee");
        } else {
            calculateCoffee(numberOfCups, water, milk, coffeeBeans);
        }


    }

    static void calculateCoffee(int numberOfCups, int water, int milk, int coffeeBeans) {
        water = water / 200;
        milk = milk / 50;
        coffeeBeans = coffeeBeans / 15;

        int possibleCups = numberOfCups * (water + milk + coffeeBeans);

        if (possibleCups > numberOfCups) {
            System.out.println("Yes, I can make that amount of coffee");
        }

/*
        if (water > milk && water > coffeeBeans) {
            System.out.printf("Yes, I can make that amount of coffee");
        } else if (milk > water && milk > coffeeBeans) {
            System.out.printf("Yes, I can make that amount of coffee");
        } else if (coffeeBeans > water && coffeeBeans > milk) {
            System.out.printf("Yes, I can make that amount of coffee");
        }
*/ 
    }
}