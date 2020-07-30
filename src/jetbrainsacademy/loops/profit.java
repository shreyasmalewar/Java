//https://hyperskill.org/learn/step/3787

package jetbrainsacademy.loops;

import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float depositMoney = scanner.nextFloat();
        float increasePercentage = scanner.nextFloat();
        int targetMoney = scanner.nextInt();
        int years = 0;

        scanner.close();

        while (depositMoney < targetMoney) {
            depositMoney =  depositMoney + (depositMoney * increasePercentage / 100);
            ++years;
        }

        System.out.println(years);
    }
}