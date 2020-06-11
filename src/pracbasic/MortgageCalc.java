package pracbasic;

import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12; // FINAL for 12 months
        final byte PERCENT = 100; // FINAL 100
        byte years;
        int principal;
        int numberOfPayments;
        float annualInterest;
        float monthlyInterest;

        // Scanner Class Implementation
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("Principal: ");
            principal = scanner.nextInt();

            System.out.printf("Annual interest rate: ");
            annualInterest = scanner.nextFloat();
            monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

            System.out.printf("Period: ");
            years = scanner.nextByte();
            numberOfPayments = years * MONTHS_IN_YEAR;
        } finally {
            scanner.close();
        }

        // Formula for calculating mortgage using math lib
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // Displaying final mortgage amount
        System.out.printf("Mortgage amount is: Rs");
        System.out.println(mortgage);
    }
}
