package basics;

import java.util.Scanner;

public class ifeleif {
    public static void main(String[] args) {
        //initialization and taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter temperature:");
        int t = scanner.nextInt();

        //if statement
        if(t > 30)
        {
            System.out.println("It is a hot day");
            System.out.println("Drink plenty of water");
        }

        //Else if statement
        else if(t > 20 && t <= 30)
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