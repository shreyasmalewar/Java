
package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
      String name;

      System.out.print("namee :");

      try{
        name = scanner.nextLine().trim();
      }finally{
        scanner.close();
      }
    
      System.out.println("Okay! You are " + name);
      
    }
    
}