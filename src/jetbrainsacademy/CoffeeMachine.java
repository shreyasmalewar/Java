package jetbrainsacademy;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();

        System.out.print("How many cups of coffee do you want to make: ");
        int numberOfCups = scanner.nextInt();
        scanner.close();

        calculateCoffee(numberOfCups, water, milk, coffeeBeans);

    }

    static void calculateCoffee(int numberOfCups, int water, int milk, int coffeeBeans) {

        int numberOfCupsRequired = numberOfCups * (water + milk + coffeeBeans);
        int numberOfCupsPossible = numberOfCups * (200 + 50 + 15);

        if (numberOfCupsPossible > numberOfCupsRequired) {
            System.out.println("Yes i can");
        } else if (numberOfCupsPossible < numberOfCupsRequired) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}