package basics;

import java.util.Scanner;

public class ifstate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        try{
            firstNumber = scanner.nextInt();
            secondNumber = scanner.nextInt();
        }finally {
            scanner.close();
        }

        if(firstNumber == secondNumber)
        {
            System.out.printf("%d is equal to %d", firstNumber, secondNumber);
        }

        else
        {
            System.out.printf("%d is not equal to %d", firstNumber, secondNumber);
        }
    }
}