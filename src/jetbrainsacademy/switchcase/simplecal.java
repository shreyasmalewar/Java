package jetbrainsacademy.switchcase;

import java.util.Scanner;

public class simplecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNum = scanner.nextLong();
        String sign = scanner.next();
        long secondNum = scanner.nextLong();
        scanner.close();

        switch (sign) {
            case "+":
                long sum = firstNum + secondNum;
                System.out.println(sum);
                break;

            case "-":
                System.out.println(firstNum - secondNum);
                break;

            case "*":
                System.out.println(firstNum * secondNum);
                break;

            case "/":
                if (secondNum == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNum / secondNum);
                }
                break;

            default:
                System.out.println("Unknown operator");
                break;
        }

    }
}
