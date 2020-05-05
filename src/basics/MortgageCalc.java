package basics;

import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12; //FINAL for 12 months 
        final byte PERCENT = 100;       //FINAL 100

        Scanner scanner = new Scanner(System.in); //Scanner Class Implementation

        System.out.println("Principal: "); //Userinput for the value of Principal
        int principal = scanner.nextInt();

        System.out.println("Annual rate of interest: "); //Userinput for Annual Rate of interest
        float annualInterest = scanner.nextFloat();      //calculating annualInterest
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; //Formula for calculating monthly interest
        
        
        System.out.println("Period : "); //Userinput Number of years
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        //Formula for calculating mortgage using math lib
        double mortgage = principal
                            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        //Displaying final mortgage amount
        System.out.println("Mortgage amount is: Rs");
        System.out.println(mortgage);
    }
}

