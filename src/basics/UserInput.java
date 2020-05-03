package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age:");
        String age = scanner.next();
        System.out.println("Your age" + age);
    }
    
}