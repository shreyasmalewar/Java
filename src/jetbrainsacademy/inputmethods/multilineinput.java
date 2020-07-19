package jetbrainsacademy.inputmethods;

import java.util.Scanner;

public class multilineinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();
        String word5 = scanner.next();
        String word6 = scanner.next();
        String word7 = scanner.next();
        String word8 = scanner.next();

        scanner.close();

        System.out.println(word8);
        System.out.println(word7);
        System.out.println(word6);
        System.out.println(word5);
        System.out.println(word4);
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);
    }
}

/*sample input
Jane Kate
John
Mary Susan Paul
Boris Ann
*/