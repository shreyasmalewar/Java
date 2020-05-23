//program to check palindrome 

package practice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String to check for Palindrome:");
		String str = s.next();
		s.close();

		checkPalindrome(str);
	}

	private static void checkPalindrome(String str) {
		char[] charArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = charArray.length - 1; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		if (sb.toString().equalsIgnoreCase(str))
			System.out.println(str + " is palindrome.");
		else
			System.out.println(str + " is not palindrome");
	}
}