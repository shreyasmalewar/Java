
package basics;

import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {

    String name;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Name :");

    try {

      name = scanner.nextLine().trim();

    } finally {

      scanner.close();

    }

    System.out.println("Okay! You are " + name);
  }

}