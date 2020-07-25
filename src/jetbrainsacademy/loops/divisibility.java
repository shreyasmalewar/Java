package jetbrainsacademy.loops;

import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;
        scanner.close();

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count = count + 1;
            }
        }
        
        System.out.println(count);
    }
}