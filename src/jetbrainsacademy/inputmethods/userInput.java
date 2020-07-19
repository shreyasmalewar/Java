package jetbrainsacademy.inputmethods;

import java.util.Scanner;

public class userInput {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String word1 = scanner.nextLine();
    String word2 = scanner.nextLine();
    String word3 = scanner.nextLine();
    scanner.close();

    System.out.println(word3);
    System.out.println(word2);
    System.out.println(word1);

    //java pro language implemented
    //https://hyperskill.org/learn/step/2922
   }

}