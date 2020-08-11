package jetbrainsacademy.strings;

import java.util.Scanner;

public class endswith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = scanner.nextLine();
        ewithburg(cityName);
        scanner.close();

    }

    // checks if a word ends with burg
    static void ewithburg(String cityName) {
        boolean endsWithBurg = cityName.endsWith("burg");

        System.out.println(endsWithBurg);

    }
}