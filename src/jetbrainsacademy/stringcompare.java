package jetbrainsacademy;

import java.util.Scanner;

public class stringcompare {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String a = scanner.nextLine();
    String b = scanner.nextLine();
    
    scanner.close();
    a = a.replace(" ", ""); //replacing spaces with no spaces lol
    b = b.replace(" ", "");
    System.out.println(b.equals(a));
    }
}