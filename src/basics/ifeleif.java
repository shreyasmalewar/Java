package basics;

import java.util.Scanner;

public class ifeleif {
    public static void main(String[] args) {
        //initialization and taking user input
        Scanner scanner = new Scanner(System.in);
        int temperature;

        try{
            System.out.printf("Enter temperature:");
            temperature = scanner.nextInt();
        }finally {
            scanner.close();
        }

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