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

        calculateCoffee(numberOfCups, water, milk, coffeeBeans);

    }

    static void calculateCoffee(int numberOfCups, int water, int milk, int coffeeBeans) {

    }
}