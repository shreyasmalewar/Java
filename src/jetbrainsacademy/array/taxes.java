package jetbrainsacademy.array;

import java.util.Scanner;

public class taxes {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inputData();
    }

    static void inputData() {
        int numberOfCompanies = scanner.nextInt();
        double[] yearlyIncomes = new double[numberOfCompanies];
        double[] individualTax = new double[numberOfCompanies];

        // loop to enter yearly income
        for (int i = 0; i < yearlyIncomes.length; i++) {
            yearlyIncomes[i] = scanner.nextInt();
        }

        // loop to enter individual tax
        for (int i = 0; i < individualTax.length; i++) {
            individualTax[i] = scanner.nextInt();
        }

        maxTax(numberOfCompanies, yearlyIncomes, individualTax);
    }

    static void maxTax(int numberOfCompanies, double[] yearlyIncomes, double[] individualTax) {
        double[] taxes = new double[numberOfCompanies];
        for (int i = 0; i < yearlyIncomes.length; i++) {
            taxes[i] = (yearlyIncomes[i] * individualTax[i]) / 100;
        }

        int maxPos = 1;
        double max = 0;
        for (int i = 0; i < taxes.length; i++) {
            if (taxes[i] > max) {
                max = taxes[i];
                maxPos = i + 1;
            }
        }

        System.out.println(maxPos);
    }
}