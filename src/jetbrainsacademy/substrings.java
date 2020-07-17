package jetbrainsacademy;

import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        scanner.close();
        
        str = str.substring(start, end);
        System.out.println(str);
    }
}