package basics;

import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12; //FINAL for 12 months 
        final byte PERCENT = 100;       //FINAL 100

        //Scanner Class Implementation
        Scanner scanner = new Scanner(System.in); 

        //Userinput for the value of Principal
        System.out.println("Principal: "); 
        int principal = scanner.nextInt();

        //Userinput for Annual Rate of interest
        System.out.println("Annual rate of interest: "); 

        //Formula for calculating monthly interest
        float annualInterest = scanner.nextFloat();      
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; 
        
        //Userinput Number of years
        System.out.println("Period : "); 
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

