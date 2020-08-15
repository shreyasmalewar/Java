// https://hyperskill.org/learn/step/2157

package jetbrainsacademy.methods;

import java.util.Scanner;

public class vowel {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        scanner.close();
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}