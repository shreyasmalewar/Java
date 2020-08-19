package jetbrainsacademy;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfCups = 0;
        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;

        System.out.print("How many cups of coffee do you want to make: ");
        numberOfCups = scanner.nextInt();
        scanner.close();

        System.out.printf("For %d cups of coffee you will need:", numberOfCups);
        System.out.println();
        System.out.printf("%d ml of water", numberOfCups * water);
        System.out.println();
        System.out.printf("%d ml of milk", numberOfCups * milk);
        System.out.println();
        System.out.printf("%d g of coffee beans", numberOfCups * coffeeBeans);
    }
}