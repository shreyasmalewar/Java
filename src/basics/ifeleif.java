package basics;

import java.util.Scanner;

public class ifeleif {
    public static void main(String[] args) {
        //initialization and taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter temperature:");
        int temperature = scanner.nextInt();

        //if statement
        if(temperature > 30)
        {
            System.out.println("It is a hot day");
            System.out.println("Drink plenty of water");
        }

        //Else if statement
        else if(temperature > 20 && temperature <= 30)
        {
            System.out.println("Beautiful day");
        }

        //Else statement
        else
        {
            System.out.println("Cold Day");
        }
    }
}