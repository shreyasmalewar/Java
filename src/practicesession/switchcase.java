package practicesession;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int role;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Admin");
        System.out.println("2. Moderator");
        System.out.println("3. Guest");
        System.out.println("Enter your choice");

        try{
            role = scanner.nextInt();
        }finally {
            scanner.close();
        }
        
        switch (role) 
        {
            case 1:
                System.out.println("You are an admin");
            break;

            case 2:
                System.out.println("You are a moderator");
            break;

            default:
                System.out.println("You are a Guest");
            break;
        }
    }
}