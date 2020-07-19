package jetbrainsacademy.strings;

import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //start and end parameters are used to extract substring
        String str = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        scanner.close();
        
        //substring implemented
        str = str.substring(start, end);
        System.out.println(str);
    }
}