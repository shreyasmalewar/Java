package jetbrainsacademy.switchcase;

import java.util.Scanner;

public class floorspace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        double r;
        double area;
        String sign = scanner.next();

        switch (sign) {
            case "+":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                area = (a + b + c) / 2;
                System.out.println(area);
                break;


            case "-":
                a = scanner.nextDouble();
                b = scanner.nextDouble(); 
                area = a * b;
                System.out.println(area);
                break;

            case "*":
                r = scanner.nextDouble();
                scanner.close();
                area = 3.14 * r * r;
                System.out.println(area);
                break;

            case "/":
                

            default:
            System.out.println("wrong choice");
        }

    }
}