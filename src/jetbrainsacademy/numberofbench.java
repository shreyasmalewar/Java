package jetbrainsacademy;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int classOne = scanner.nextInt();
        int classTwo = scanner.nextInt();
        int classThree = scanner.nextInt();

        scanner.close();

        //number of benches in class 1, 2 and 3
        int benchesOne;
        int benchesTwo;
        int benchesThree;

        if (classOne % 2 == 0) {
            benchesOne = classOne / 2;
        } else {
            benchesOne = classOne / 2 + 1;
        }

        if (classTwo % 2 == 0) {
            benchesTwo = classTwo / 2;
        } else {
            benchesTwo = classTwo / 2 + 1;
        }

        if (classThree % 2 == 0) {
            benchesThree = classThree / 2;
        } else {
            benchesThree = classThree / 2 + 1;
        }

        int totalBenches = benchesOne + benchesTwo + benchesThree;

        System.out.println(totalBenches);
    }
}