package jetbrainsacademy.switchcase;

import java.util.Scanner;

public class simplecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNum = scanner.nextInt();
        String sign = scanner.next();
        long secondNum = scanner.nextInt();
        int num;
        scanner.close();

        System.out.println(firstNum);
        System.out.println(sign);
        System.out.println(secondNum);

        if (sign == "+") {
            System.out.println("c");
            num = 1;
        } else if (sign == "-") {
            num = 2;
        } else if (sign == "*") {
            num = 3;
        } else if (sign == "/") {
            num = 4;
        } else {
            num = 5;
        }

        switch (num) {
            case 1:
                long sum = firstNum + secondNum;
                System.out.println(sum);
                break;

            case 2:
                System.out.println(firstNum - secondNum);
                break;

            case 3:
                System.out.println(firstNum * secondNum);
                break;

            case 4:
                if (secondNum == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNum / secondNum);
                }
            default:
                System.out.println();
                break;
        }

    }
}