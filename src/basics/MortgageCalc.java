package basics;

import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual rate of interest: ");
        float annualInterest = scanner.nextFloat();

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        System.out.println("Period : ");

        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        System.out.println("Mortgage amount is: Rs");
        System.out.println(mortgage);
    }
}

