package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);

      System.out.print("name :");

      String name = scan.nextLine().trim();

      System.out.println("Okay! You are " + name);
      
    }
    
}