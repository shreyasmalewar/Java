package jetbrainsacademy;

import java.util.Scanner;

public class endswith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cityName = scanner.nextLine();
        scanner.close();

        boolean endsWithBurg = cityName.endsWith("burg");

        System.out.println(endsWithBurg);
    }
}